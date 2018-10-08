package com.abhishek.questions.corejava.singleton.serialization;

import java.io.Serializable;

public class Singleton implements Serializable {

    public static Singleton instance = new Singleton();

    private Singleton(){}

    //resolved this singleton destroy from the below method
    public Object readResolve() {
        return instance;
    }
}
