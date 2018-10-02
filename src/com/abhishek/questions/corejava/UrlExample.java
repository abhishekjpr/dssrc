package com.abhishek.questions.corejava;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UrlExample {
    public static void main(String[] args) {
        String[] arr = getMovieTitles("Waterworld");
        for(String s : arr)
            System.out.println(s);
    }

    static String[] getMovieTitles(String substr) {
        try{
            String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title="+substr;

            String response = sendGET(url);
            String[] arr = parse(response, substr);
            return arr;
        }catch(Exception e){}
        return null;
    }

    private static String sendGET(String GET_URL) throws IOException {
        URL obj = new URL(GET_URL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        StringBuffer response = new StringBuffer();
        int responseCode = con.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
        }
        return response.toString();
    }

    public static String[] parse(String jsonLine, String substr) throws IOException {
        List<String> list = new ArrayList<>();
        JsonElement jelement = new JsonParser().parse(jsonLine);
        JsonObject  jobject = jelement.getAsJsonObject();
        jelement = jobject.get("total_pages");
        int result = Integer.parseInt(jelement.getAsString());
        for(int i = 1; i <= result; ++i) {
            String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title="+substr+"&page="+i;
            String response = sendGET(url);
            jelement = new JsonParser().parse(response);
            jobject = jelement.getAsJsonObject();
            JsonArray jsonArray = jobject.getAsJsonArray("data");
            for(int k = 0; k < jsonArray.size(); ++k) {
                jobject = jsonArray.get(k).getAsJsonObject();
                jelement = jobject.get("Title");
                list.add(jelement.getAsString());
            }
        }
        Collections.sort(list);
        String[] arr = list.toArray(new String[0]);
        return arr;

    }

}