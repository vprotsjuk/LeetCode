package src;

import java.util.*;
import java.util.stream.Stream;

import static java.util.Collections.list;

public class LeetCode_451 {
    public static void main(String[] args) {
        String s = "cccaaCaAA";
        char[] arr = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (char c : arr) {
            map.put(c, map.merge(c, 1, (OldOne, NewOne) -> (OldOne + 1)));
//            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        String res = "";
        List<Map.Entry<Character, Integer>> list =new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Collections.reverse(list);
        System.out.println(list);
        System.out.println(list.get(1).getValue());

        for (int i = 0; i < list.size(); i++) {
            int temp = Integer.MAX_VALUE;
            int n = 0;

            while (temp > 0) {
                res += list.get(i).getKey();
                n++;
                temp = list.get(i).getValue()-n;

            }
        }
        System.out.println(res);
    }
}
//        StringBuilder res = new StringBuilder();
//        int l = 0;
//        int r = arr.length-1;
//        char temp;
//        while (l<=r){
//            temp = arr[l];
//            arr[l] = arr[r];
//            arr[r] = temp;
//            l++;
//            r--;
//        }
//        StringBuilder sb = new StringBuilder();
//        for (char a:  arr) {
//            res.append(a);
//        }
//        System.out.println(res);    }
//
//
//

//        return res;
//    }

//}
