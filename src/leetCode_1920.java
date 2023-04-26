package src;

import java.util.Arrays;

public class leetCode_1920 {
    public static void main(String[] args) {


        int [] nums = {0,2,1,5,3,4};
            int [] output = new int [nums.length];
            for (int i = 0; i < nums.length; i++){
                output [i] = nums[nums[i]];
            }
        System.out.println(Arrays.toString(output));
    }
}
