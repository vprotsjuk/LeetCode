package src;

import java.util.*;

public class leetCode_973_2 {
    public static void main(String[] args) {
        int[][] points = new int[][]{{0, 1}, {1, 0}};
        int k = 2;

        Arrays.sort(points, (p1, p2) -> p1[0] * p1[0] + p1[1] * p1[1] -
                p2[0] * p2[0] - p2[1] * p2[1]);
        System.out.println(Arrays.deepToString(Arrays.copyOfRange(points, 0, k)));
    }
}
//        Set<Integer> set = new HashSet<>();
//        set.add(3);
//        set.add(2);
//        set.add(2);
//        set.add(1);
//        System.out.println(set);

//        int[][] ans = new int[k][2];
//        Map<int[], Double> pointToDistance = new HashMap<>();
//        ArrayList<Double> arr = new ArrayList<>();
//        for (int[] p : points) {
//            double dist = dist(p);
//            pointToDistance.put(p, dist);
//            arr.add(dist);
//        }
//        Collections.sort(arr);
////        System.out.println(Arrays.copyOfRange(points, 0, k));
//        for (int i = 0; i < k; i++) {
//            for (Map.Entry<int[], Double> pair : pointToDistance.entrySet()) {
//                if (Objects.equals(pair.getValue(), arr.get(i))) {
//                    ans[i] = pair.getKey();
//                    pointToDistance.entrySet().remove(pair);
//                    break;
//                }
//            }
//        }
//        System.out.println(Arrays.deepToString(ans));
//    }
//
//    private static double dist(int[] point) {
//        return (Math.pow(point[0], 2) + Math.pow(point[1], 2));
//    }
//}