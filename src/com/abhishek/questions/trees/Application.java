package com.abhishek.questions.trees;

import com.abhishek.questions.trees.problems.PrintPathEqualToSumOfGivenNumber;
import com.abhishek.questions.trees.problems.PrintRootToLeatAllPaths;
import com.abhishek.questions.trees.util.BinarySearchTreeUtil;
import com.abhishek.questions.trees.util.Node;

public class Application {

    public static void main(String[] args) {
        int n = 5;
        BinarySearchTreeUtil binarySearchTreeUtil = new BinarySearchTreeUtil();
        Node root = binarySearchTreeUtil.createBST(n);
        System.out.println("Preorder traversal is : ");
        binarySearchTreeUtil.printPreorder(root);
        System.out.println("\nPostorder traversal is : ");
        binarySearchTreeUtil.printPostorder(root);
        System.out.println("\nInorder traversal is : ");
        binarySearchTreeUtil.printInorder(root);

        PrintRootToLeatAllPaths printRootToLeatAllPaths = new PrintRootToLeatAllPaths();
        printRootToLeatAllPaths.printRootToLeaf(root);

        PrintPathEqualToSumOfGivenNumber printPathEqualToSumOfGivenNumber = new PrintPathEqualToSumOfGivenNumber();
        printPathEqualToSumOfGivenNumber.printRootToLeaf(root, 35);
    }
}
