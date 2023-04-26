package src;

import java.util.Arrays;

public class lettCode_283_3 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 0, 4};
        int[] res = new int[nums.length];
        int[] zero = new int[nums.length];
        int zeroQuantyty = 0;
        int temp = 1;
        for (int i = 0; i < zero.length; i++) {
            if (nums[i] == 0) {
                zeroQuantyty++;
            }
            if (zeroQuantyty > 1) {
                System.out.println(Arrays.toString(zero));
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            } else {
                temp *= nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero[i] = (temp);
                System.out.println(Arrays.toString(zero));
            } else {
                res[i] = (int) (temp * Math.sqrt(Math.pow(nums[i], -2)));
            }
        }
        System.out.println(Arrays.toString(res));
        System.out.println(24 * (Math.sqrt(Math.pow(8, -2))));
    }
}
