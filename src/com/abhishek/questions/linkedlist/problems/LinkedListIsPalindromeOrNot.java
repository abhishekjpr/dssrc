package com.abhishek.questions.linkedlist.problems;

import com.abhishek.questions.linkedlist.util.Node;
import com.abhishek.questions.linkedlist.util.SingleLinkedList;

import java.util.Stack;

public class LinkedListIsPalindromeOrNot {
    public static void main(String[] args) {
        Node root = null;
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        root = singleLinkedList.createLinkedList();
        singleLinkedList.printLinkedList(root);

        System.out.println("Linked List isPlaindrome() : " + isPlaindrome(root));
    }

    public static boolean isPlaindrome(Node root) {
        Node temp = root;
        int size = new SingleLinkedList().size(root);
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < size/2; ++i) {
            stack.push(temp.data);
            temp = temp.next;
        }
        if(size%2 != 0){
            stack.push(temp.data);
            stack.pop();
            temp = temp.next;
        }
        while(!stack.isEmpty()){
            if(stack.pop() != temp.data) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
}
