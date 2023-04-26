package src;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_523 {
    public static void main(String[] args) {
        int[] nums = {5, 0, 0, 0};
        int k = 3;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int mod = 0;
        for (int i = 0; i < nums.length; i++) {
            mod = (mod + nums[i]) % k;
            if (map.containsKey(mod) ) {
                if (i - map.get(mod) > 1)
                    System.out.println("true");

//                return true;
            }
            else {
                map.put(mod, i);
            }
        }
        System.out.println("false");
//        return false;
    }
}

//        long sum = 0;
//        map.put(0, -1); // base case no sum at -1 position
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//            int key = (int) sum % k;
//            if (map.containsKey(key)) {
//                // System.out.println(i + " "+key);
//                // subArray size greater than 1
//                if (i - map.get(key) > 1)
//                    System.out.println("true");
////        return true;
//            } else
//                map.put(key, i);
//        }
//        System.out.println("false");
////        return false;
//    }
//}
