package src;

import java.util.Arrays;

public class leetCode_1929 {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3};
        int [] output = new int [nums.length * 2];
        for (int i = 0; i < nums.length; i++){
            output[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++){
            output[nums.length + i] = nums[i];
        }
        System.out.println(Arrays.toString(output));
    }
}
