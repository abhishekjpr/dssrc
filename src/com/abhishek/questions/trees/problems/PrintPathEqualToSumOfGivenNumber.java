package com.abhishek.questions.trees.problems;

import com.abhishek.questions.trees.util.Node;

//root-to-leaf-path-sum-equal-to-a-given-number/
public class PrintPathEqualToSumOfGivenNumber {

    public void printRootToLeaf(Node root, int givenSum){
        System.out.println("\nGiven sum : "+givenSum);
        String str = new String("");
        auxPrint(root, str, 0, givenSum);
        return;
    }

    public void auxPrint(Node root, String str, int sum, int givenSum){
        if(root.left == null && root.right == null){
            sum += root.data;
            if(sum == givenSum){
                System.out.println("Sum exists..");
            }
            return;
        }
        if(root.left != null)
            auxPrint(root.left, str+"-"+root.data, sum+root.data, givenSum);
        if(root.right != null){
            auxPrint(root.right, str+"-"+root.data, sum+root.data, givenSum);
        }
        return;
    }
}
