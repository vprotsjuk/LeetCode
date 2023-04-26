package src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class leetCode_167 {
    public static void main(String[] args) {
        int [] nums = {2,7,9,13};
        int k = 9;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i ++){
            if (map.containsKey(k - nums[i])){
                int j = map.get(k - nums[i]);
                System.out.println(Arrays.toString(new int [] {j+1, i+1}));
            }
            else{
                map.put(nums[i], i);
            }
        }
    }
}
