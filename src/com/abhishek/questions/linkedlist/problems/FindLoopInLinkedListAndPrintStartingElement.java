package com.abhishek.questions.linkedlist.problems;

import com.abhishek.questions.linkedlist.util.Node;
import com.abhishek.questions.linkedlist.util.LinkedListOperations;
import com.abhishek.questions.linkedlist.util.SingleLinkedList;

import java.util.HashMap;
import java.util.Map;

public class FindLoopInLinkedListAndPrintStartingElement {
    public static void main(String[] args) {
        Node root;
        LinkedListOperations linkedListOperations = new LinkedListOperations();
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        root = singleLinkedList.createLinkedList();
        singleLinkedList.printLinkedList(root);
        root = linkedListOperations.createLoopInLinkedList(root);
        System.out.println("Loop Exists : " + loopExistsInLinkedListOrNot2(root));
        System.out.println("Loop Exists with data : " + findFirstElementOfLoop(root));
    }

    //Solution 2
    public static boolean loopExistsInLinkedListOrNot2(Node root) {
        Map<Node, Integer> map = new HashMap<Node, Integer>();
        Node temp = root;
        while(temp != null) {
            if(map.containsKey(temp))
                return true;
            else
                map.put(temp, temp.data);
            temp = temp.next;
        }
        return false;
    }

    //Solution 1
    public static boolean loopExistsInLinkedListOrNot(Node root) {
        if (root == null){
            System.out.println("List is Empty..");
            return false;
        }
        Node slowPtr = root, fastPtr = root;
        while (slowPtr != null && fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr){
                System.out.println(slowPtr.data);
                return true;
            }
        }
        return false;
    }

    private static Integer findFirstElementOfLoop(Node root) {
        if (root == null){
            System.out.println("List is Empty..");
            return null;
        }
        Node slowPtr = root, fastPtr = root;
        Node temp = root;
        while (slowPtr != null && fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr){
                temp = slowPtr;
                break;
            }
        }
        slowPtr = root;
        while(slowPtr != temp) {
            slowPtr = slowPtr.next;
            temp = temp.next;
        }
        return slowPtr.data;
    }
}
