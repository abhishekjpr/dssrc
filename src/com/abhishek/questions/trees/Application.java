package com.abhishek.questions.trees;

import com.abhishek.questions.trees.problems.DiagonalTraversalOfBT;
import com.abhishek.questions.trees.problems.DiameterOfBinaryTree;
import com.abhishek.questions.trees.problems.HeightOfBinaryTree;
import com.abhishek.questions.trees.problems.VerticalTraversalOfBinaryTree;
import com.abhishek.questions.trees.util.BinarySearchTreeUtil;
import com.abhishek.questions.trees.util.Node;

public class Application {

    public static void main(String[] args) {

        int n = 15;

        BinarySearchTreeUtil binarySearchTreeUtil = new BinarySearchTreeUtil();
        Node root = binarySearchTreeUtil.createBST(n);
        System.out.println("Preorder traversal is : ");
        binarySearchTreeUtil.printPreorder(root);
        System.out.println("\nPostorder traversal is : ");
        binarySearchTreeUtil.printPostorder(root);
        System.out.println("\nInorder traversal is : ");
        binarySearchTreeUtil.printInorder(root);


        HeightOfBinaryTree heightOfBinaryTree = new HeightOfBinaryTree();
        System.out.println("\nHeight of binary search tree : " + heightOfBinaryTree.heightOfBT(root));

        DiameterOfBinaryTree diameterOfBinaryTree = new DiameterOfBinaryTree();
        System.out.println("\nDiameter of binary search tree : " + diameterOfBinaryTree.diameterOfBT(root));

        VerticalTraversalOfBinaryTree verticalTraversalOfBinaryTree = new VerticalTraversalOfBinaryTree();
        System.out.println("Vertical traversal of BT : ");
        verticalTraversalOfBinaryTree.verticalTraversal(root);

        DiagonalTraversalOfBT diagonalTraversalOfBT = new DiagonalTraversalOfBT();
        System.out.println("Diagonal traversal of BT : ");
        diagonalTraversalOfBT.diagonalPrint(root);
    }
}
