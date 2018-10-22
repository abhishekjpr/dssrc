package com.abhishek.questions.corejava.objecthashmapexample;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Student, Integer> map = new HashMap<>();

        Student s1 = new Student(1, "Abhishek");
        Student s2 = new Student(1, "Abhishek");

        map.put(s1, 1);
        map.put(s2, 2);
        System.out.println(map.size());

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
