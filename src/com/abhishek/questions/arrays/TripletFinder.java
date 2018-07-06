package com.abhishek.questions.arrays;

/*Find a triplet that sum to a given value
Given an array and a value, find if there is a triplet in array whose sum is equal to the given value. If there is such a triplet present in array, then print the triplet and return true. Else return false. For example, if the given array is {12, 3, 4, 1, 6, 9} and given sum is 24, then there is a triplet (12, 3 and 9) present in array whose sum is 24.*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TripletFinder {

    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[r.nextInt(30)];
        int sum = r.nextInt(30);
        for(int i = 0; i < array.length; ++i)
            array[i] = r.nextInt(16);
        printArray(array);
        System.out.println(sum);
        System.out.println(isTripletAvailable(array, sum));
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; ++i)
            System.out.print(array[i]+" ");
        System.out.println();
    }

    //Using Data Structures
    public static boolean isTripletAvailable(int[] array, int sum) {

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < array.length - 2; ++i){
            int tempSum = sum - array[i];
            for(int j = i+1; j < array.length; ++j){
                if(set.contains(tempSum - array[j])){
                    return true;
                }
                set.add(array[j]);
            }
        }
        return false;
    }


}
