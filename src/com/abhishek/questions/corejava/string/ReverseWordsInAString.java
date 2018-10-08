package com.abhishek.questions.corejava.string;

public class ReverseWordsInAString {

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }

    public static String reverseWords(String s) {
        System.out.println(s);
        s = s.trim();
        char[] a = s.toCharArray();
        boolean isSpace = false;
        String str = "";
        for(char ch : a){
            if(ch != ' '){
                isSpace = false;
                if(!isSpace) {
                    str += ch;
                }
            } else {
                if(isSpace==false)
                    str += " ";
                isSpace = true;
            }
        }
        String[] arr = str.split(" ");
        String result = new String();
        for(int i = arr.length-1; i >= 0; --i){
            result += arr[i]+" ";
        }
        return result.trim();
    }
}
