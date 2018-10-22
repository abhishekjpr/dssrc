package com.abhishek.questions.matchschedular;

public class MatchSchedular {

    public static void main(String[] args) {
        scheduleMatches(8);
    }

    static void scheduleMatches(int N){
        if(N<=1)
            return;

        int totalMatches = N*(N-1)/2;
        int MAX_MATCHES_IN_DAY = N/2;
        int days = 0;
        int[] a = new int[N-1];
        for(int i=0;i<N-1;i++)
            a[i] = i+1;

        while(totalMatches!=0){
            int j=0;
            int num = MAX_MATCHES_IN_DAY;
            System.out.print("\n Day " + (days+1) + " Matches :");
            while(num!=0){
                // Check if team j has played all the matches
                if(a[j]<N){
                    int matchnumber = N*(N-1)/2 - totalMatches +1;
                    System.out.print("Match " + matchnumber +": " + "Team " + (j+1) + " Vs Team " + (a[j]+1) + " ");
                    a[j++] += 1;
                    totalMatches--;
                    num--;
                }else
                    j++;
            }
            days++;
        }

        System.out.println("\n Total Number of Days is " + days);
    }
}
