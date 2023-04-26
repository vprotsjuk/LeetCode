package src;

import java.util.*;

public class leetcode_347_2 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,55,55,55,4,4,4,4,4,4,4};
        int k = 2;
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        System.out.println("1 " + map);

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
                new PriorityQueue<>((o,n)->(n.getValue()-o.getValue()));
        System.out.println(maxHeap);
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            maxHeap.add(entry);
        }
        System.out.println(maxHeap);

        List<Integer> res = new ArrayList<>();
        while(res.size()<k){
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            res.add(entry.getKey());
        }
        System.out.println(res);
    }
}
