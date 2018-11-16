package com.abhishek.questions.arrays;

/*
Find an element in array such that sum of left array is equal to sum of right array
Given, an array of size n. Find an element which divides the array in two sub-arrays with equal sum.

Examples:

Input : 1 4 2 5
Output : 2
Explanation : If 2 is the partition,
subarrays are : {1, 4} and {5}

Input : 2 3 4 1 4 5
Output : 1
Explanation : If 1 is the partition,
Subarrays are : {2, 3, 4} and {4, 5}

*/

import java.util.Random;

public class IndexWhereLeftAndRightSumAreEqual {

    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[]{1, 2, 3, -5, -6, 17, -2, 2};
        printArray(array);
        System.out.println("\n"+indexOfElement(array));
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; ++i)
            System.out.print(array[i]+" ");
    }

    public static int indexOfElement(int[] array) {
        int i = 0, j = array.length-1;
        int leftSum = array[i], rightSum = array[j];
        ++i; --j;
        while (i < j) {
            if(leftSum <= rightSum) {
                leftSum += array[i];
                ++i;
            } else if(rightSum < leftSum){
                rightSum += array[j];
                --j;
            }
            if (leftSum == rightSum && (j-i) <= 1){
                return array[i];
            }
        }
        return -1;
    }
}
