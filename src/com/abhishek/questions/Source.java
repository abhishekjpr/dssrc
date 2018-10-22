package com.abhishek.questions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Source {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] arr = line.split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        String[] newStr = new String[n];
        for(int i = 0; i < n; ++i){
            newStr[i] = br.readLine();
        }
        line = br.readLine();
        String[] krr = line.split(" ");
        line = br.readLine();
        String[] lrr = line.split(" ");
        int rate_emp = Integer.parseInt(krr[0]);
        int new_emp = Integer.parseInt(krr[1]);
        int rate_head = Integer.parseInt(lrr[0]);
        int new_head = Integer.parseInt(lrr[1]);
        int total = 0;
        for(int i = 0; i < newStr.length; ++i){
            System.out.println(newStr[i]);
            int count = 0;
            boolean bFlag = false;

            for(int j = 0; j < newStr[i].length(); ++j){
                char ch = newStr[i].charAt(j);
                if(ch == 'B'){
                    if(bFlag == false && count == 0){
                        bFlag = true;
                        ++count;
                        break;
                    }
                }
            }
            count = 0;
            for(int j = 0; j < newStr[i].length(); ++j){

                if(newStr[i].charAt(j) == 'B' || newStr[i].charAt(j) == 'C'){
                    count++;
                }

            }
            if(bFlag == true){
                //System.out.println("1. "+rate_head+"-"+count+"-"+new_head);
                total += ((rate_head)*count) + new_head;
            } else {
                //System.out.println("2. "+rate_emp+"-"+count+"-"+new_emp);
                total += ((rate_emp)*count) + new_emp;
            }
        }
        System.out.println(total);
    }
}
