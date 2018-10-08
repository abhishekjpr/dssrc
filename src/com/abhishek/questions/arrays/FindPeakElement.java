package com.abhishek.questions.arrays;

public class FindPeakElement {

    public static void main(String[] args) {
        System.out.println(maximumGap(new int[]{100,3,2,1}));
    }

    public static int maximumGap(int[] nums) {
        if(nums.length<2)
            return 0;
        int max = nums[0] - nums[1];
        for(int i = 2; i < nums.length; ++i) {
            int diff = nums[i]-nums[i-1];
            if(diff>max)
                max=diff;
        }
        return max;
    }
}
