package com.abhishek.questions.trees.util;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class BinarySearchTreeUtil {

    public Node createBST(int n){
        Node root = null;
        Random r = new Random();
        for(int i = 0; i < n; ++i){
            Node temp = root;
            int data = r.nextInt(135);
            System.out.println(data);
            Node node = new Node();
            node.data = data;
            if(root == null){
                root = temp = node;
            } else {

                while (true){
                    if(temp.data >= node.data && temp.left != null)
                        temp = temp.left;
                    else if(temp.data < node.data && temp.right != null)
                        temp = temp.right;
                    else {
                        if(temp.data >= node.data)
                            temp.left = node;
                        else
                            temp.right = node;
                        break;
                    }
                }
            }
        }
        return root;
    }

    public void printPreorder(Node root){
        if(root == null)
            return;
        System.out.print(root.data + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public void printPostorder(Node root){
        if(root == null)
            return;
        printPostorder(root.left);
        printPostorder(root.right);
        System.out.print(root.data + " ");
    }

    public void printInorder(Node root){
        if(root == null)
            return;
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node temp = queue.remove();
            System.out.print(temp.data+" ");
            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
    }
}
