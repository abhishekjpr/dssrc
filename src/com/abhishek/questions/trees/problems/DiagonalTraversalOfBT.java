package com.abhishek.questions.trees.problems;

import com.abhishek.questions.trees.util.Node;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class DiagonalTraversalOfBT {

    public void diagonalPrint(Node root){

        HashMap<Integer, Vector<Node>> map = new HashMap<>();
        int hd = 0;
        auxDiagonalPrint(root, hd, map);

        for(Map.Entry<Integer, Vector<Node>> node : map.entrySet()){
            printVector(node.getValue());
        }
    }

    private void auxDiagonalPrint(Node root, int hd, HashMap<Integer, Vector<Node>> map) {
        if(root == null)
            return;
        Vector vector = map.get(hd);

        if(vector == null){
            vector = new Vector();
            vector.add(root);
        } else{
            vector.add(root);
        }
        map.put(hd, vector);
        auxDiagonalPrint(root.left, hd+1, map);
        auxDiagonalPrint(root.right, hd, map);
    }

    public void printVector(Vector<Node> nodes){
        for(Node node : nodes){
            System.out.print(node.data + " ");
        }
        System.out.println();
    }
}
