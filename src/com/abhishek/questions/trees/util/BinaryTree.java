package com.abhishek.questions.trees.util;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class BinaryTree {

    public Node createBinaryTree() {
        Node root = null, temp = null;
        Queue<Node> queue = new PriorityQueue<>();
        Random r = new Random();
        int N = r.nextInt(10);
        for(int i = 0; i < N; ++i) {
            int data = r.nextInt(50);
            Node node = new Node();
            node.data = data;
            if(root == null){
                root = temp = node;
            } else {
                Node popNode = null;
                queue.add(node);
                while (popNode.left != null){}
            }
        }
        return null;
    }
}
