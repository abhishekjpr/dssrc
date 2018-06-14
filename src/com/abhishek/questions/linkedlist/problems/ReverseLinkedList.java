package com.abhishek.questions.linkedlist.problems;

import com.abhishek.questions.linkedlist.util.Node;
import com.abhishek.questions.linkedlist.util.SingleLinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node root;
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        root = singleLinkedList.createLinkedList();
        singleLinkedList.printLinkedList(root);
        System.out.println("List after reversing is : ");
        root = reverseLinkedList(root);
        singleLinkedList.printLinkedList(root);
    }

    public static Node reverseLinkedList(Node root){
        Node curr, next, prev;
        curr = next = root;
        prev = null;
        if (root == null) {
            System.out.println("List is empty..");
            return root;
        }
        while(next != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        root = prev;
        return root;
    }
}
