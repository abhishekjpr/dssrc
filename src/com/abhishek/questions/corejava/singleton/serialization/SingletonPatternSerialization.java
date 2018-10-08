package com.abhishek.questions.corejava.singleton.serialization;

import java.io.*;

public class SingletonPatternSerialization {

    public static void main(String[] args) throws Exception {
        Singleton instance1 = Singleton.instance;
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file.text"));
        out.writeObject(instance1);
        out.close();

        // deserailize from file to object
        ObjectInput in
                = new ObjectInputStream(new FileInputStream("file.text"));

        Singleton instance2 = (Singleton) in.readObject();
        in.close();

        System.out.println("instance1 hashCode:- "
                + instance1.hashCode());
        System.out.println("instance2 hashCode:- "
                + instance2.hashCode());
    }
}
