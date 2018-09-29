package com.abhishek.questions.hackerearth;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class NissanDeveloperHiringProblem_1 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();

        String[] strArray = br.readLine().split(" ");
        long[] array = new long[strArray.length];

        for(int i = 0; i < array.length; ++i) {
            array[i] = Long.parseLong(strArray[i]);
        }

        String queries = br.readLine();
        Arrays.sort(array);

        HashMap<Long, Long> map = new HashMap<>();
        HashMap<Long, Long> result = new HashMap<>();

        for(int i = 0; i < Integer.parseInt(queries); ++i) {
            String val = br.readLine();
            if(!map.containsKey(val)) {
                map.put(Long.parseLong(val), getResult(Long.parseLong(val), array, result));
            }
            System.out.println(map.get(Long.parseLong(val)));
        }
    }

    private static long getResult(long val, long[] array, HashMap<Long, Long> results) {

        if(array[0] > val) {
            return 0;
        }

        long sum = 0;
        long avg = 0;
        long count = 0;

        for(int i = 0; i < array.length; ++i) {
            sum += array[i];
            count++;
            avg = sum / count;
            if(avg < val){

            } else{

                return count-1;
            }
        }

        return count;
    }
}
