package com.abhishek.questions.arrays;

import java.util.Random;

public class Sort0s1s2s {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[r.nextInt(40)];
        for(int i = 0; i < array.length; ++i)
            array[i] = r.nextInt(3);
        printArray(array);
        array = sort0s1s2s(array);
        printArray(array);
    }

    private static int[] sort0s1s2s(int[] array) {
        int low = 0, high = array.length-1;
        int mid = 0, temp = 0;
        while (mid <= high){
            switch (array[mid]){
                case 0:
                    temp = array[low];
                    array[low] = array[mid];
                    array[mid] = temp;
                    mid++;
                    low++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = array[high];
                    array[high] = array[mid];
                    array[mid] = temp;
                    high--;
                    break;
            }
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; ++i)
            System.out.print(array[i]+" ");

        System.out.println();
    }
}
