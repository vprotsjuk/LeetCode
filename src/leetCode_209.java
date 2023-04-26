package src;

import java.util.*;

public class leetCode_209 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int k = 16;
        if (nums.length == 0){
            System.out.println(0);
        }
        int i = 0;
        int j = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while (j < nums.length){
            sum += nums[j];
            j++;
            while (sum >= k){
                min = Math.min(min, j-i);
                sum -= nums[i];
                i++;
            }
        }
        if (min == Integer.MAX_VALUE){
            System.out.println(0);
        }
        else {
            System.out.println(min);
        }
    }
}