package com.abhishek.questions.trees.problems;

import com.abhishek.questions.trees.util.Node;

import java.util.LinkedList;
import java.util.Queue;

public class CommonNodesInTwoBST {

    //Solution 1
    public void commonNodesInTwoBST(Node root1, Node root2){
        if(root1 == null || root2 == null){
            System.out.println("No Common Nodes.");
            return;
        }
        System.out.println("\nCommon Nodes Are :: ");
        Queue<Node> queue = new LinkedList<>();
        queue.add(root1);
        while (!queue.isEmpty()){
            Node node = queue.remove();
            if(searchInBst(node.data, root2)){
                System.out.print(node.data+" ");
            }
            if(node.left != null)
                queue.add(node.left);
            if(node.right != null)
                queue.add(node.right);
        }
    }

    //Solution 1
    public boolean searchInBst(int data, Node root){

        if(root == null)
            return false;
        if (root.data > data)
            return searchInBst(data, root.left);
        else if(root.data < data)
            return searchInBst(data, root.right);
        else
            return true;
    }
}
