package com.abhishek.questions.trees.problems;

import com.abhishek.questions.trees.util.Node;

import java.util.Stack;

public class ZigZagTraversalOfBT {

    public void zigZagTraversal(Node root){

        boolean leftToRight = true;
        if(root == null)
            return;
        Stack<Node> currentLevel = new Stack<>();
        Stack<Node> nextLevel = new Stack<>();
        currentLevel.push(root);
        while (!currentLevel.isEmpty()){
            Node temp = currentLevel.pop();
            System.out.print(temp.data + " ");
            if(leftToRight){
                if(temp.left != null)
                    nextLevel.push(temp.left);
                if(temp.right != null)
                    nextLevel.push(temp.right);
            } else {
                if(temp.right != null)
                    nextLevel.push(temp.right);
                if(temp.left != null)
                    nextLevel.push(temp.left);
            }
            if(currentLevel.isEmpty()){
                leftToRight = !leftToRight;
                Stack<Node> tempo = currentLevel;
                currentLevel = nextLevel;
                nextLevel = tempo;
            }
        }
    }
}
