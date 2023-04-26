package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetCode_238 {
    public static void main(String[] args) {
//        List<Integer> integers = new ArrayList<>(Arrays.asList(10, 20, 30));
//        Integer integerSum = integers.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(integerSum);

        int[] nums = {1, 2, 3,0, 4};
        int[] result = new int[nums.length];
        int count = 0;
        int temp = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i == count) {
                temp = nums[i];
                nums[i] = 1;
                result[i] = mult(nums);
                nums[i] = temp;
                count++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
    public static int mult(int[] nums) {
        int tempRes = 1;
        for (int num : nums) {
            tempRes *= num;
        }
        return tempRes;
    }
}
//
//
//}
//            result[i] = (int) (tempRes * ( Math.sqrt(Math.pow(nums[i], -2))));
//        }
//        System.out.println(Arrays.toString(result));
//        System.out.println(tempRes);
//System.out.println(Arrays.toString(result));
//        System.out.println(24 * (Math.sqrt(Math.pow(4, -2))));
//        System.out.println(Math.sqrt(Math.pow(3, -2)));

