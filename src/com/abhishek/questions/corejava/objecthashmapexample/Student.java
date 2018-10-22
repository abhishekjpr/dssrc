package com.abhishek.questions.corejava.objecthashmapexample;

public class Student {

    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Student s1){
        if(this == s1)
            return true;
        if(!(s1 instanceof Student))
            return false;
        return ((this.getId() == s1.getId()) && this.getName().equals(s1.getName()));
    }
}
