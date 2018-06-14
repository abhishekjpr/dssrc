package com.abhishek.questions.linkedlist.problems;

import com.abhishek.questions.linkedlist.util.Node;
import com.abhishek.questions.linkedlist.util.SingleLinkedList;

public class FindLoopInLinkedListAndPrintStartingElement {
    public static void main(String[] args) {
        Node root;
        Node loopNode = null;
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        root = singleLinkedList.createLinkedList();
        singleLinkedList.printLinkedList(root);
        root = singleLinkedList.createLoopInLinkedList(root);
        loopNode = findLoopNode(root);
        System.out.println(loopNode);
    }

    public static Node findLoopNode(Node root) {
        if (root == null){
            System.out.println("List is Empty..");
            return null;
        }
        Node slowPtr = root, fastPtr = root.next;
        while (slowPtr != null && fastPtr != null){
            if(slowPtr == fastPtr){
                return fastPtr;
            }
            fastPtr = fastPtr.next;
            if(slowPtr == fastPtr){
                return fastPtr;
            }
        }
        if(slowPtr == null || fastPtr == null){
            System.out.println("No Loop Detected..");
            return null;
        }
        return null;
    }
}
