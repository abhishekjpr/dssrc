package com.abhishek.questions.corejava;

public class ReplaceCharactedFromString {

    public static void main(String[] args) {
        String str = "mississippi";
        char[] arr = str.toCharArray();
        char ch = 's';
        char to = 'm';
        for(int i = 0; i < str.length(); ++i){
            if(str.charAt(i) == ch){
                arr[i] = to;
            }
        }
        System.out.println(arr);
    }
}
