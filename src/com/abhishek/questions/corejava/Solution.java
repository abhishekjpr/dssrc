package com.abhishek.questions.corejava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        System.out.println(line);
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < line.length(); ++i){
            list.add(line.charAt(i));
        }
        System.out.println(list);
        int count = 1;
        int start = 0;
        int end = 0;
        int j = 0;
        while (true){
            try {
                start = j;
                while (list.get(j) == list.get(j + 1)) {
                    j++;
                    ++count;
                    end = j;
                }
                if (count % 2 != 0) {
                    ++j;
                    count = 1;
                    continue;
                } else {
                    char ch = list.get(start);
                    while (list.get(start) == ch) {
                        list.remove(start);
                    }
                    j = 0;
                    count = 1;
                }
            }catch (Exception e){
                count = 1;
                for(j = 0; j < list.size()-1; ++j){
                    if(list.get(j) == list.get(j+1)){
                        count++;
                    }else {
                        count = 3; break;
                    }
                }
                if(count%2!=0)
                    System.out.println(list);
                break;
            }
        }
    }
}
