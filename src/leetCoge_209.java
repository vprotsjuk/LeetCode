package src;

import java.util.*;

public class leetCoge_209 {
    public static void main(String[] args) {
        int[] nums = new int[]{5,1,3,5,10,7,4,9,2,8};
        int target = 15;
        int tempSum = 0;
        int l = 0;
        int r = 0;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int k = i;
            tempSum = 0;
            while (tempSum < target && k < nums.length) {
                tempSum += nums[k];
                if (nums[i] >= target) {
                    System.out.println(1);
                }
                if (tempSum >= target) {
                    if ((k-i + 1) < ans) {
                        ans = k-i + 1;
                        l = i;
                        r = k;
                    }
                }

                if (i == 0 && tempSum < target && k == nums.length-1){
                    System.out.println(0);
                    break;
                }
                k++;

            }

        }
        System.out.println( r-l+1);
    }
}





