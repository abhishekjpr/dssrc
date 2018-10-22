package com.abhishek.questions.trees.problems;

import com.abhishek.questions.trees.util.Node;

public class PrintRootToLeatAllPaths {

    public void printRootToLeaf(Node root){
        String str = new String("");
        System.out.println("\nPrint root to leaf paths : ");
        auxPrint(root, str);
        return;
    }

    public void auxPrint(Node root, String str){
        if(root.left == null && root.right == null){
            str += "-" + root.data;
            System.out.println(str.substring(1, str.length()));
            return;
        }
        if(root.left != null)
            auxPrint(root.left, str+"-"+root.data);
        if(root.right != null){
            auxPrint(root.right, str+"-"+root.data);
        }
        return;
    }
}
