package com.abhishek.questions.corejava.objecthashmapexample;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Student, Integer> map = new HashMap<>();

        Student s1 = new Student(1, "Abhishek");

        map.put(s1, 111);
        map.put(s1, 222);
        System.out.println(map.size());
        System.out.println(map.get(s1));
        System.out.println(s1.hashCode());
    }
}
