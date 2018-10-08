package com.abhishek.questions.corejava;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class TestClass {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sizeOfArray = br.readLine();                // Reading input from STDIN
        String readLine = br.readLine();
        readLine = readLine.replaceAll(" ","");
        System.out.println(readLine);
        displayAllSeq(3, readLine.toCharArray());
    }

    public static void displayAllSeq(int n, char[] in) {
        char[] out = new char[n];
        List<String> list = new ArrayList<>();
        auxAllSeq(0, n, in, out, list);
    }
    private static void auxAllSeq(int d, int n, char[] in, char[] out, List<String> list) {
        if(d == n) {
            if(list.contains(String.valueOf(out)))
                return;
            System.out.println(out);
            list.add(String.valueOf(out));
            return;
        }
        for(int i = 0; i < in.length; ++i) {
            out[d] = in[i];
            auxAllSeq(d+1, n, in, out, list);
        }
    }

}
