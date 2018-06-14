package com.abhishek.questions.linkedlist.problems;

import com.abhishek.questions.linkedlist.util.Node;
import com.abhishek.questions.linkedlist.util.SingleLinkedList;

public class PrintLinkedListInReverseFashionRecursive {

    public static void main(String[] args) {
        Node root = null;
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        root = singleLinkedList.createLinkedList();
        System.out.println("Linked list is : ");
        singleLinkedList.printLinkedList(root);
        System.out.println("Linked list in reverse fashion is : ");
        printLinkedListInReverseFashionRecursive(root);
        System.out.println("NULL");
    }

    public static void printLinkedListInReverseFashionRecursive(Node root) {
        if(root == null) {
            return;
        }
        printLinkedListInReverseFashionRecursive(root.next);
        System.out.print(root.data + "->");
    }
}
