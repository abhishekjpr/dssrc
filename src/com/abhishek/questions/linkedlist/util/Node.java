package com.abhishek.questions.linkedlist.util;

public class Node {
    public Integer data;
    public Node next;

    public Node() {
        data = 0;
        next = null;
    }

    public Node(Integer data) {
        this.data = data;
    }

    public String toString(){
        return data + "->" + next;
    }
}
