package com.abhishek.questions.trees.problems;

import java.util.Stack;

public class PreorderIsBstOrNot {

    public boolean checkPreorderIsBstOrNot(int [] pre){

        int root = Integer.MIN_VALUE;
        Stack<Integer> s = new Stack<Integer>();

        for (int i = 0; i < pre.length; i++) {
            if (pre[i] < root) {
                return false;
            }

            while (!s.empty() && s.peek() < pre[i]) {
                root = s.peek();
                s.pop();
            }
            s.push(pre[i]);
        }
        return true;
    }
}
