package com.abhishek.questions.arrays;

/*
Find the Number Occurring Odd Number of Times
        Given an array of positive integers. All numbers occur even number of times except one number which occurs odd number of times. Find the number in O(n) time & constant space.

        Examples :

        Input : arr = {1, 2, 3, 2, 3, 1, 3}
        Output : 3

        Input : arr = {5, 7, 2, 7, 5, 2, 5}
        Output : 5
*/

import java.util.Random;

public class OddNumberFinder {

    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[]{1,1,2,2,2,3,3,4,4};
        printArray(array);
        System.out.println(oddNumberFinder(array));
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; ++i)
            System.out.print(array[i]+" ");
        System.out.println();
    }

    public static int oddNumberFinder(int[] array) {
        int result = 0;
        for(int i = 0; i < array.length; ++i) {
            result = result ^ array[i];
        }
        return result;
    }
}
