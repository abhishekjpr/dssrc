package com.abhishek.questions.trees.problems;

import com.abhishek.questions.trees.util.Node;

public class HeightOfBinaryTree {

    public int heightOfBT(Node root){
        if(root == null)
            return 0;
        int left = heightOfBT(root.left)+1;
        int right = heightOfBT(root.right)+1;
        return Math.max(left, right);
    }
}
