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

    public void insertNumber(Node root, int data) {

    }

    public void deleteNumber(Node root, int data) {

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
            ++size;
            temp = temp.next;
        }
        return size;
    }

    private final Logger log = Logger.getLogger(SingleLinkedList.class.getSimpleName());
}
