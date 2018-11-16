package com.abhishek.questions.arrays;

import java.util.Arrays;

public class SeggregatePositiveAndNegative {

    public static void main(String[] args) {
        int[] arr = new int[]{-2, -3, 4, 5, 7, -10, -12, -13, 44, 10};
        System.out.println(Arrays.toString(arr));
        seggregatePositiveAndNegative(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void seggregatePositiveAndNegative(int[] arr){

        int i = 0;
        int j;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        if(arr.length % 2 == 0)
            j = arr.length/2;
        else
            j = (arr.length/2) + 1;
        while(j < arr.length){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i+=2;
            j+=2;
        }
    }
}
