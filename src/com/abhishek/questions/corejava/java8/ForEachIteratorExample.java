package com.abhishek.questions.corejava.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachIteratorExample {

    //forEach implementation in Iterable interface.

/*
    default void forEach(Consumer<? super T> action) {
        Objects.requireNonNull(action);
        for (T t : this) {
            action.accept(t);
        }
    }
*/

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 10; ++i)
            list.add(i);

        //Traditional method to iterate over a list
        Iterator iterator = list.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next()+" ");
        System.out.println();
        //Java 8 feature
        //without lambda
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer+" ");
            }
        });
        System.out.println();
        //with lambda
        list.forEach(integer -> System.out.print(integer + " "));
        System.out.println();
    }
}