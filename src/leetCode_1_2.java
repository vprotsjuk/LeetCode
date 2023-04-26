package src;

import java.util.*;

public class leetCode_1_2 {
    public static void main(String[] args) {
        int [] nums = {1,-3,5,45,67,13,23,2,0,9,46,18,1,2,5,9};
        Arrays.sort(nums);
        int k = 55;
//        int []res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(k - nums[i])) {
                int j = map.get(k - nums[i]);
                System.out.println(Arrays.toString(new int[]{j, i}));

                break;
            }
            else {
                map.put(nums[i], i);
            }
        }
    }
}
