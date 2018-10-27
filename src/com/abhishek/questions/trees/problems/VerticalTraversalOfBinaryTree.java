package com.abhishek.questions.trees.problems;


import com.abhishek.questions.trees.util.Node;

import java.util.*;

public class VerticalTraversalOfBinaryTree {

    public void verticalTraversal(Node root){
        TreeMap<Integer, Vector<Node>> map = new TreeMap<>();
        int hd = 0;
        auxPrintVertical(root, hd, map);
        for(Map.Entry<Integer, Vector<Node>> node : map.entrySet()){
            printVector(node.getValue());
        }
    }

    private void auxPrintVertical(Node root, int hd, TreeMap<Integer, Vector<Node>> map) {

        if(root == null)
            return;

        Vector<Node> vector = map.get(hd);
        if(vector == null){
            vector = new Vector<>();
            vector.add(root);
        } else {
            vector.add(root);
        }
        map.put(hd, vector);
        auxPrintVertical(root.left, hd-1, map);
        auxPrintVertical(root.right, hd+1, map);
    }

    public void printVector(Vector<Node> nodes){
        for(Node node : nodes){
            System.out.print(node.data + " ");
        }
        System.out.println();
    }
}
