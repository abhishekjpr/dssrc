package com.abhishek.questions.linkedlist.problems;

import com.abhishek.questions.linkedlist.util.LinkedListOperations;
import com.abhishek.questions.linkedlist.util.Node;
import com.abhishek.questions.linkedlist.util.SingleLinkedList;

import java.util.Stack;

public class FindMergeNodeOfLinkedList {
    public static void main(String[] args) {
        Node root1, root2;
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        LinkedListOperations linkedListOperations = new LinkedListOperations();

        //Preparing first list..
        root1 = singleLinkedList.createLinkedList();
        singleLinkedList.printLinkedList(root1);

        //Preparing second list..
        root2 = singleLinkedList.createLinkedList();
        singleLinkedList.printLinkedList(root2);

        linkedListOperations.mergeLinkedListAtSomePoint(root1, root2);
        System.out.println("After merging lists are : ");
        singleLinkedList.printLinkedList(root1);
        System.out.println();
        singleLinkedList.printLinkedList(root2);

        System.out.println("Solution 1 - Merge Node of LinkedList is : " + mergeNodeOfLinkedList(root1, root2).data);
        System.out.println("Solution 2 - Merge Node of LinkedList is : " + mergeNodeOfLinkedList2(root1, root2).data);
    }

    //Solution 1 - Using Stack
    public static Node mergeNodeOfLinkedList(Node root1, Node root2) {
        Stack<Node> stackFirst = new Stack<>();
        Stack<Node> stackSecond = new Stack<>();
        Node temp = root1;
        while(temp != null) {
            stackFirst.push(temp);
            temp = temp.next;
        }
        temp = root2;
        while(temp != null) {
            stackSecond.push(temp);
            temp = temp.next;
        }

        Node resultNode = null;
        while(stackFirst.peek() == stackSecond.peek()){
            resultNode = stackFirst.pop();
            stackSecond.pop();
        }
        return resultNode;
    }

    //Solution 2 - Using length
    public static Node mergeNodeOfLinkedList2(Node root1, Node root2) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        int sizeRoot1 = singleLinkedList.size(root1);
        int sizeRoot2 = singleLinkedList.size(root2);
        Node temp1 = sizeRoot1 > sizeRoot2 ? root1 : root2;
        Node temp2 = null;
        int diff = 0;
        if(temp1 == root1){
            diff = sizeRoot1 - sizeRoot2;
            temp2 = root2;
        } else {
            diff = sizeRoot1 - sizeRoot2;
            temp2 = temp1;
        }
        while (diff != 0) {
            temp1 = temp1.next;
            --diff;
        }

        while (temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
}
