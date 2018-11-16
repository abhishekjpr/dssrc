package com.abhishek.questions.trees;

import com.abhishek.questions.trees.problems.*;
import com.abhishek.questions.trees.util.BinarySearchTreeUtil;
import com.abhishek.questions.trees.util.Node;

public class Application {

    public static void main(String[] args) {

        int n = 25;

        BinarySearchTreeUtil binarySearchTreeUtil = new BinarySearchTreeUtil();
        Node root = binarySearchTreeUtil.createBST(n);
        System.out.println("Preorder traversal is : ");
        binarySearchTreeUtil.printPreorder(root);
        System.out.println("\nPostorder traversal is : ");
        binarySearchTreeUtil.printPostorder(root);
        System.out.println("\nInorder traversal is : ");
        binarySearchTreeUtil.printInorder(root);
        System.out.println("\nLevel order traversal is : ");
        binarySearchTreeUtil.levelOrder(root);

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

        ZigZagTraversalOfBT zigZagTraversalOfBT = new ZigZagTraversalOfBT();
        System.out.println("Zig Zag traversal of BT : ");
        zigZagTraversalOfBT.zigZagTraversal(root);

        Node root2 = binarySearchTreeUtil.createBST(n);

        System.out.println("\nInorder traversal is : ");
        binarySearchTreeUtil.printInorder(root2);

        CommonNodesInTwoBST commonNodesInTwoBST = new CommonNodesInTwoBST();
        commonNodesInTwoBST.commonNodesInTwoBST(root, root2);

        System.out.println("\nInorder Successor is : ");

        InorderSuccessorOfNode inorderSuccessorOfNode = new InorderSuccessorOfNode();
        System.out.println(inorderSuccessorOfNode.inorderSuccessor(122, root2).data);
    }
}
