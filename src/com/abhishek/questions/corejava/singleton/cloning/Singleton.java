package com.abhishek.questions.corejava.singleton.cloning;

public class Singleton extends SuperClass{

    // public instance initialized when loading the class
    public static Singleton instance = new Singleton();

    private Singleton()
    {
        // private constructor
    }

    protected Object clone() throws CloneNotSupportedException {
        return instance;
    }
}
