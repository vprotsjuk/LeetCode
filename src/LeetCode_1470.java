package src;

import java.util.Arrays;

public class LeetCode_1470 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,1,2,3,4};
        int n = nums.length/2;
        int [] ans = new int[nums.length];
        int even = 0;
        int odd = 1;
        int count = 0;
        while (even < nums.length){
            ans[even] = nums[count];
            ans[odd] = nums[count + n];
            even+=2;
            odd+=2;
            count ++;
        }
        System.out.println(Arrays.toString(ans));

    }


}
