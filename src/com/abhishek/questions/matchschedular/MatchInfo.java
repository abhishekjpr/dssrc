package com.abhishek.questions.matchschedular;

import com.abhishek.questions.matchschedular.exception.DaysNotSufficientException;

public class MatchInfo {

    public static void main(String[] args) {
        for(int i = 2; i <= 5; ++i) {
            try {
                countMatch(i, 3);
            } catch (Exception e){
                System.out.println("Days not sufficient");
            }
        }
    }

    public static void countMatch(int n, int x) throws DaysNotSufficientException {
        System.out.print(n+"--->");
        if(n <= 1)
            return;
        int TOTAL_MATCHES = (n * (n-1)) /2;
        int MAX_NUM_OF_DAYS = (TOTAL_MATCHES%2 == 0) ? TOTAL_MATCHES/2 : (TOTAL_MATCHES/2)+1;
        if(x < MAX_NUM_OF_DAYS)
            throw new DaysNotSufficientException("Days are not sufficient");
        System.out.println(TOTAL_MATCHES + " <-----> " + MAX_NUM_OF_DAYS);

    }
}
