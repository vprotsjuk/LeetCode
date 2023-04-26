package src;

import java.util.Arrays;

public class LeetCode_807 {
    public static void main(String[] args) {

        int[][] grid = {{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        int res = 0;
//        int n = grid.length;
//        int m = grid[0].length;
//        int[] maxrow = new int[n];
//        int[] maxcol = new int[m];
//        for(int i = 0; i < n; i++)
//            for(int j = 0 ; j < m; j++){
//                maxrow[i] = Math.max(maxrow[i], grid[i][j]);
//                maxcol[j] = Math.max(maxcol[j], grid[i][j]);
//            }
//        System.out.println(Arrays.toString(maxrow));
//        System.out.println(Arrays.toString(maxcol));
//        int count = 0;
//        for(int i = 0; i < n; i++)
//            for(int j = 0 ; j < m; j++)
//                count += (Math.min(maxrow[i], maxcol[j]) - grid[i][j]);
//
//        System.out.println(count);;
//    }
//}
//        int temp = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] < Math.min(highestInRow(grid[i]), highestInCol(grid, j))) {
                    res += Math.min(highestInRow(grid[i]), highestInCol(grid, j)) - grid[i][j];
                }


            }
        }
        System.out.println(res);

    }

    public static int highestInCol(int[][] grid, int col) {
        int highestCol = 0;
        for (int[] ints : grid) {
            if (ints[col] > highestCol) {
                highestCol = ints[col];
            }
        }
        return highestCol;
    }

    public static int highestInRow(int[] row) {
        int highestRow = 0;
        for (int j : row) {
            if (j > highestRow) {
                highestRow = j;
            }
        }
        return highestRow;
    }
}
