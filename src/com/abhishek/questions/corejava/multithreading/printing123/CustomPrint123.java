package com.abhishek.questions.corejava.multithreading.printing123;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomPrint123 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        resource.setStatus(1);

        Print1 p1 = new Print1(resource);
        Thread t1=  new Thread(p1);

        Print2 p2 = new Print2(resource);
        Thread t2=  new Thread(p2);

        Print3 p3 = new Print3(resource);
        Thread t3=  new Thread(p3);

        t1.start();

        t2.start();
        t3.start();
    }
}

class SharedResource {
    int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

class Print1 implements Runnable {

    SharedResource resource;

    public Print1(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run(){
        while(true) {
            try {
                if(resource.getStatus() == 1) {
                    System.out.print("1 ");
                    resource.setStatus(2);
                    Thread.sleep(1500);
                }
            }catch (Exception e){

            }
        }
    }
}

class Print2 implements Runnable {

    SharedResource resource;

    public Print2(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run(){
        while(true) {
            try {
                if(resource.getStatus() == 2) {
                    System.out.print("2 ");
                    resource.setStatus(3);
                    Thread.sleep(1500);
                    Iterator iterator = new ArrayList<>().iterator();
                }
            }catch (Exception e){

            }
        }
    }
}


class Print3 implements Runnable {

    SharedResource resource;

    public Print3(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run(){
        while(true) {
            try {
                if(resource.getStatus() == 3) {
                    System.out.print("3 ");
                    resource.setStatus(1);
                    Thread.sleep(1500);
                }
            }catch (Exception e){

            }
        }
    }
}
