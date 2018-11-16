package com.abhishek.questions.trees.problems;

import com.abhishek.questions.trees.util.Node;

public class InorderSuccessorOfNode {

    public Node inorderSuccessor(int data, Node root){

        Node searchNode = searchInBst(data, root);
        if(searchNode != null) {
            if (searchNode.right != null) {
                //case_A
                System.out.println("Case A");
                return case_A(searchNode);
            } else {
                //case_B
                System.out.println("Case B");
                return case_B(root, data);
            }
        }
        return null;
    }

    public Node case_A(Node root){
        Node temp = root.right;
        while(temp.left != null){
            temp = temp.left;
        }
        return temp;
    }

    public Node case_B(Node root, int data){
        Node temp = root;
        if(root == null)
            return null;
        Node result = null;
        while (true){
            if(temp.data < data){
                temp = temp.right;
            }
            else if(temp.data > data){
                result = temp;
                temp = temp.left;
            }
            else
                return result;
        }
    }

    //Solution 1
    public Node searchInBst(int data, Node root){

        if(root == null)
            return null;
        if (root.data > data)
            return searchInBst(data, root.left);
        else if(root.data < data)
            return searchInBst(data, root.right);
        else
            return root;
    }
}
