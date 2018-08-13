package com.abhishek.questions.dynamicprogramming;

import java.util.Random;

public class FibonacciNumbers {

    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10000);
        System.out.println(num);
        long start = System.currentTimeMillis();
        System.out.println(fib1(num-1));
        long end = System.currentTimeMillis();
        System.out.println("fib1 -> Time taken : " + (end-start)/1000+" seconds..");
        start = System.currentTimeMillis();
        System.out.println(fib2(num));
        end = System.currentTimeMillis();
        System.out.println("fib2 -> Time taken : " + (end-start)/1000+" seconds..");
        start = System.currentTimeMillis();
        System.out.println(fib3(num));
        end = System.currentTimeMillis();
        System.out.println("fib3 -> Time taken : " + (end-start)/1000+" seconds..");
        start = System.currentTimeMillis();
        System.out.println(fib4(num));
        end = System.currentTimeMillis();
        System.out.println("fib4 -> Time taken : " + (end-start)/1000+" seconds..");
    }

    public static long fib1(long n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return fib1(n-1) + fib1(n-2);
    }

    //DP using --> memoization
    public static long fib2(int n) {
        long[] mem = new long[n + 1];
        mem[0] = 0;
        mem[1] = 1;
        mem[n] = auxiliary(mem, n);
        return mem[n-1];
    }

    private static long auxiliary(long[] mem, int n) {
        if (n <= 2)
            return 1;
        if(mem[n] != 0)
            return mem[n];
        mem[n] = auxiliary(mem, n-1) + auxiliary(mem, n-2);
        return mem[n];
    }

    public static long fib3(int n){
        long[] mem = new long[n+1];
        mem[0] = 0;
        mem[1] = 1;
        for(int i = 2; i < n; i++){
            mem[i] = mem[i-1] + mem[i-2];
        }
        return mem[n-1];
    }

    public static long fib4(int num){
        long a = 0;
        long b = 1;
        long sum = 0;
        for(int i = 2; i < num; ++i){
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
