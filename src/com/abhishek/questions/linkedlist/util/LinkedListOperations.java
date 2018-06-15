package com.abhishek.questions.linkedlist.util;

import java.security.PublicKey;

public class LinkedListOperations {

    public Node createLoopInLinkedList(Node root) {
        Node temp = root;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = root.next.next;
        return root;
    }

    public static void mergeLinkedListAtSomePoint(Node root1, Node root2){
        Node temp = root1;
        Node temp2 = root2;
        while (temp.next != null)
            temp = temp.next;
        int sizeOfSecondLinkedList = new SingleLinkedList().size(root2);
        int count = sizeOfSecondLinkedList/2;
        while(count != -1){
            temp2 = temp2.next;
            --count;
        }
        temp.next = temp2;
    }
}
