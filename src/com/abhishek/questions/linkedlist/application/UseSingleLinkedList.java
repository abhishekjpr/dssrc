package com.abhishek.questions.linkedlist.application;

import com.abhishek.questions.linkedlist.util.Node;
import com.abhishek.questions.linkedlist.util.SingleLinkedList;

import java.util.logging.Logger;

//Basic singly linked list operations..
public class UseSingleLinkedList {

    public static void main(String[] args) {
        log.info("Executing Main()");
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        Node root;
        System.out.println("Creating linked list..");
        root = singleLinkedList.createLinkedList();
        singleLinkedList.printLinkedList(root);
        log.info("Exiting from Main()");
    }

    private final static Logger log = Logger.getLogger(UseSingleLinkedList.class.getSimpleName());
}
