package src;

import java.util.Arrays;
import java.util.HashMap;

public class leetCode_1 {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 18;
        int [] res = twosum(nums, target);
        System.out.println(Arrays.toString(res));
    }
    public static int [] twosum(int[] nums, int target){

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(target - nums[i])){
                int j = map.get(target - nums[i]);
                return new int []{j, i};
            }
            else {
                map.put(nums[i], i);
            }
        }
        return new  int []{9,9};
    }
}
