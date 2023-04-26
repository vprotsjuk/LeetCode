package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetCode_238_2 {
    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 7};
        int[] result = new int[nums.length];
        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        System.out.println(Arrays.toString(result));

        int rIndex = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * rIndex;
            rIndex = rIndex * nums[i];
        }
        System.out.println(Arrays.toString(result));
    }
}

//        int[] res = new int[nums.length];
//        res[0] = 1;
//        System.out.println(Arrays.toString(nums));
//
//        for (int i = 1; i < nums.length; i++) {
//            res[i] = res[i - 1] * nums[i - 1];
//        }
//        System.out.println(Arrays.toString(res));
//        int right = 1;
//        for (int i = nums.length - 1; i >= 0; i--) {
//            res[i] *= right;
//            right *= nums[i];
//        }
//        System.out.println(Arrays.toString(res));
//    }
//}

