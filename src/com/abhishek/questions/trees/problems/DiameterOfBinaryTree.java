package com.abhishek.questions.trees.problems;

import com.abhishek.questions.trees.util.Node;

public class DiameterOfBinaryTree {

    public int diameterOfBT(Node root){
        HeightOfBinaryTree heightOfBinaryTree = new HeightOfBinaryTree();
        return heightOfBinaryTree.heightOfBT(root.left) +
                    heightOfBinaryTree.heightOfBT(root.right) + 1;
    }
}
