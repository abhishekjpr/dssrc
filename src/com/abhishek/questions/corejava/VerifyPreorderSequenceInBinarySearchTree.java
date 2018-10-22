package com.abhishek.questions.corejava;

public class VerifyPreorderSequenceInBinarySearchTree {

    public static boolean isValid(int arr[], int start, int end, int min, int max){
        if(start>=end){
            return true;
        }

        int root = arr[start];

        //Find Max index
        int maxIndex = start;
        for (int i = start; i <= end; i++) {
            if(arr[i] < min || arr[i] > max){
                return false;
            }
            if(arr[i] > root){
                break;
            }
            maxIndex++;
        }


        boolean left = isValid(arr, start+1, maxIndex-1, min, arr[start]-1);
        //arr[start]-1 because for next recursive call, max should be one less(on Left side)  as we are assuming BST doesn't contain duplicates

        boolean right = isValid(arr, maxIndex, end, arr[start]+1, max);
        //arr[start]+1 because for next recursive call, min should be one more(on Right side) as we are assuming BST doesn't contain duplicates

        return left && right;
    }

    public static void main(String[] args) {
        new VerifyPreorderSequenceInBinarySearchTree();
    }

    public VerifyPreorderSequenceInBinarySearchTree() {
        int[] preOrderTraversal = {3, 4, 5, 1, 2};
        System.out.println(isValid(preOrderTraversal, 0, preOrderTraversal.length-1, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
