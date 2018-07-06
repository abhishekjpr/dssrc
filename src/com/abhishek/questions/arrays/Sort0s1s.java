package com.abhishek.questions.arrays;

import java.util.Arrays;
import java.util.Random;

public class Sort0s1s {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[r.nextInt(25)];
        for(int i = 0; i < array.length; ++i)
            array[i] = r.nextInt(2);
        printArray(array);
        int[] newArr = sort0s1s(array);
        printArray(array);
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; ++i)
            System.out.print(array[i]+" ");
        System.out.println();
    }

    public static int[] sort0s1s(int[] array) {
        int i = 0;
        int j = array.length - 1;
        while(i <= j) {
            if(array[i] == 0 && array[j] == 1){
            } else if (array[i] == 0){
                ++i;
                continue;
            } else if(array[j] == 1){
                --j;
                continue;
            } else{
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            ++i;
            --j;
        }
        return array;
    }
}
