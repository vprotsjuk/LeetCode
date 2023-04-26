package src;

import java.io.UnsupportedEncodingException;
import java.util.*;

public class LeetCode_2206_Get_Or_Default {
    public static void main(String[] args) throws UnsupportedEncodingException {
        int[] nums = new int[]{7,2,7,2,2};
        Map<Integer, Integer> map1 = new HashMap();
        map1.put(1,11);
        map1.put(2,22);
        map1.put(3,33);
        map1.put (4, map1.getOrDefault (2, 0) + 1);
//        map1.put (1, map1.getOrDefault (1, 0) + 1);
//        map1.put(map1.get(1), map1.getOrDefault(map1, 0) );
        System.out.println(map1);
        System.out.println(map1.getOrDefault(5,999));

        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(nums[i])){
//                map.put(nums[i], map.get(nums[i]) + 1);
//            }
//        }
        for (int val : map.values()) {
            if (val % 2 != 0){
                System.out.println("false");
                break;
            }
        }
        System.out.println("true");
        final String string = "Hello World";

        System.out.println(string.length()); // prints "11"

        final byte[] utf8Bytes = string.getBytes("UTF-8");
        System.out.println(utf8Bytes.length); // prints "11"
    }
}

//
//            map.put (nums[i], map.getOrDefault (nums[i], 0) + 1);
//        }
//        for (int values : map.values()) {
//            if (values % 2 != 0) {
//                System.out.println("false");
//                break;
//            }
//        }
//
//        System.out.println("true");
//        System.out.println();
//
//    }
//}