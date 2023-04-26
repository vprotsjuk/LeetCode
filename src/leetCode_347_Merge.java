package src;

import java.util.*;

public class leetCode_347_Merge {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 1,1, 2,2,2};
        int k = 2;
        int[] res = new int[k];
        int a = Integer.MIN_VALUE;


        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.merge(num, 1, (o, n) -> (o + 1)));
//            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        System.out.println(map);
        List<Map.Entry<Integer, Integer>> list =new ArrayList<>(map.entrySet());
        System.out.println(list);
        list.sort(Map.Entry.comparingByValue());
        Collections.reverse(list);
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i).getKey();
        }
        System.out.println(Arrays.toString(res));
//        System.out.println(list.get(0).getKey());


    }
}

//        Set<Integer> set = new HashSet<>();
//        List<Integer> list = new ArrayList<>();
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            set.add(entry.getValue());
//        }
//        list = set.stream().toList();
//        System.out.println("List = " + list);
//        List<Integer> list2 = new ArrayList<>();
//
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            for (int i = list.size()-1; i > list.size()-k-1; i--) {
//                if (Objects.equals(entry.getValue(), list.get(i))) {
//                    list2.add( entry.getKey());
//                }
//            }
//
//        }
//        for (int i = 0; i < list2.size(); i++) {
//            res[i] = list2.get(i);
//        }
////        System.out.println(list2);
//        System.out.println(Arrays.toString(res));
//    }
//}
//
//        System.out.println(list2);
//        System.out.println(Arrays.toString(res));
//
//        HashMap<Integer, String> map1 = new HashMap<>();
//        map1.put(1, "L");
//        map1.put(2, "M");
//        map1.put(3, "N");
//
//        HashMap<Integer, String> map2 = new HashMap<>();
//        map2.put(1, "B");
//        map2.put(2, "G");
//        map2.put(3, "R");
//
//        // print map details
//        System.out.println("HashMap1: " + map1);
//
//        System.out.println("HashMap2: " + map2);
//        // provide value for new key which is absent
//        // using computeIfAbsent method
////        map2.forEach((key, value) -> map1.merge(key, value, (v1, v2) ->
////                v1.equalsIgnoreCase(v2) ? v1 : v1 + ", " + v2));
//        map2.forEach((key, value) -> map1.merge(key, value, (v1, v2) ->
//                v1.equalsIgnoreCase(v2) ? v1 : v1 + ", " + v2));
//
//        // print new mapping
//        System.out.println("New HashMap: " + map1);


//