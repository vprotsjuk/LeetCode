package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class leetCode_973 {
    public static void main(String[] args) {
        int[][] points = new int[][]{{-2, 10}, {-4, -8}, {10, 7}, {-4, -7}};
        int k = 3;
        int[][] result = new int[k][2];
        int distance = 0;
        int min = Integer.MAX_VALUE;
        int counter = 0;
        int j = 0;
        if (k == points.length) {
            System.out.println(Arrays.deepToString(points));
        } else {
            while (counter < k) {
                for (int i = 0; i < points.length; i++) {
                    distance = points[i][0] * points[i][0] + points[i][1] * points[i][1];
                    min = Math.min(distance, min);
                }
                for (int i = 0; i < points.length; i++) {
                    distance = points[i][0] * points[i][0] + points[i][1] * points[i][1];
                    if (distance == min) {
                        result[j][0] = points[i][0];
                        result[j][1] = points[i][1];
                        points[i][0] = 10000;
                        points[i][1] = 10000;
                        break;
                    }
                }
                min = Integer.MAX_VALUE;
                counter++;
                j++;
            }
            System.out.println(Arrays.deepToString(result));
        }
    }
}


