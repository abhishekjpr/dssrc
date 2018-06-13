package com.abhishek.questions.linkedlist.application;

import com.abhishek.questions.linkedlist.util.Node;
import com.abhishek.questions.linkedlist.util.SingleLinkedList;

import java.util.logging.Logger;

//Basic singly linked list operations..
public class UseSingleLinkedList {

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        Node root;
        System.out.println("Creating linked list..");
        root = singleLinkedList.createLinkedList();
        singleLinkedList.printLinkedList(root);
        root = singleLinkedList.insertFirst(root, 62);
        singleLinkedList.printLinkedList(root);
        root = singleLinkedList.insertLast(root, 120);
        singleLinkedList.printLinkedList(root);
        root = singleLinkedList.insertAtPosition(root, 79, 8);
        singleLinkedList.printLinkedList(root);
    }

    private final static Logger log = Logger.getLogger(UseSingleLinkedList.class.getSimpleName());
}
