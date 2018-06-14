package com.abhishek.questions.linkedlist.util;

import sun.rmi.runtime.Log;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.logging.Logger;

public class SingleLinkedList {

    public Node createLinkedList() {
        Random random = new Random(); //to generate random numbers
        Node root = null, temp = null;
        int numberOfNodes = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            numberOfNodes = random.nextInt(15) + 1;
            log.info("[createLinkedList] Generating "+numberOfNodes+" numbers..");
            for(int i = 0; i < numberOfNodes; ++i) {
                int data = random.nextInt(100) + 1;
                Node node = new Node(data);
                if(root == null) {
                    root = temp = node;
                } else {
                    temp.next = node;
                    temp = temp.next;
                }
            }
        } catch (Exception e) {
            System.out.println("Exception occurred while reading input");
            e.printStackTrace();
        }
        return root;
    }

    public Node insertFirst(Node root, int data) {
        Node temp = root;
        Node node = new Node(data);
        root = node;
        root.next = temp;
        return root;
    }

    public Node insertLast(Node root, int data) {
        Node temp = root;
        if(root == null) {
            root = new Node(data);
            return root;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        return root;
    }

    public Node insertAtPosition(Node root, int data, int position) {
        Node curr = root, nextNode = root;
        if(size(root) <= position){
            System.out.println("Invalid position..");
            return root;
        }
        if(position == 0){
            root = new Node(data);
            root.next = curr;
            return root;
        }
        while (position != 0){
            curr = curr.next;
            --position;
        }
        nextNode = curr.next;
        curr.next = new Node(data);
        curr.next.next = nextNode;
        return root;
    }

    public void printLinkedList(Node root) {
        Node temp = root;
        if(temp == null) {
            System.out.println("Empty linked list..");
            return;
        }
        System.out.println("Linked list is : ");
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public boolean contains(Node root, int data){
        Node temp = root;
        while(temp != null) {
            if(temp.data == data)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public Integer size(Node root) {
        Node temp = root;
        int size = 0;
        while (temp != null){
            temp = temp.next;
            ++size;
        }
        return size;
    }

    public Node createLoopInLinkedList(Node root) {
        Node temp = root;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = root.next.next;
        return root;
    }

    private final Logger log = Logger.getLogger(SingleLinkedList.class.getSimpleName());
}
