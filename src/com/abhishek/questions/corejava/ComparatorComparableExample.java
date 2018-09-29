package com.abhishek.questions.corejava;

import com.sun.tools.corba.se.idl.constExpr.Or;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorComparableExample {

    static class Order implements Comparable<Order> {

        int id;
        int price;
        String brand;
        public Order(int id, int price, String brand){
            this.id = id;
            this.price = price;
            this.brand = brand;
        }

        public String toString(){
            return id + " - " + price + " - " + brand;
        }

        @Override
        public int compareTo(Order o) {
            return this.id > o.id ? 1 : (this.id < o.id ? -1 : 0);
        }

        public static class OrderByAmount implements Comparator<Order> {

            @Override
            public int compare(Order o1, Order o2) {
                return o1.price > o2.price ? 1 : (o1.price < o2.price ? -1 : 0);
            }
        }

        public static class OrderByName implements Comparator<Order> {

            @Override
            public int compare(Order o1, Order o2) {
                return o1.brand.compareTo(o2.brand);
            }
        }
    }

    public static void main(String[] args) {
        Order o1 = new Order(101, 1000, "Sony");
        Order o2 = new Order(102, 500, "LG");
        Order o3 = new Order(103, 4000, "Hitachi");

        List<Order> list = new ArrayList<Order>();
        list.add(o3);
        list.add(o1);
        list.add(o2);

        //Unsorted list
        System.out.println(list.toString());

        Collections.sort(list);

        //Sorted List
        System.out.println(list.toString());

        Collections.sort(list, Collections.reverseOrder());

        //Sorted in reverse order
        System.out.println(list.toString());

        Collections.sort(list, new Order.OrderByAmount());

        //Sorted using amount
        System.out.println(list.toString());

        Collections.sort(list, new Order.OrderByName());

        //Sorted using name
        System.out.println(list.toString());
    }
}
