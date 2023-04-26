package src;
//{{'1','1','1','1','0'},{'1','1','0','1','0'},
//        {'1','1','0','0','0'},{'0','0','0','0','0'}, {'0','0','1','0','0'},
//        {'0','0','1','0','0'}};
//[["1","1","0","0","0"],["1","1","0","0","0"],["0","0","1","0","0"],["0","0","0","1","1"]]

//[["1","0","1","1","1"],["1","0","1","0","1"],["1","1","1","0","1"]]

public class leetCode_200_3 {
    public static void main(String[] args) {
        char[][] grid = {{'1', '0', '1', '1', '1'}, {'1', '0', '1', '0', '1'},
                {'1', '1', '1', '0', '1'}};
        for (char[] chars : grid) {
            System.out.println();
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
        }
        System.out.println();


        int count = 0;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfsFill(grid, i, j);
                    count++;
                }
            }
        for (char[] chars : grid) {
            System.out.println();
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
        }
        System.out.println();
        System.out.println(count);
    }
    private static void dfsFill(char[][] grid, int i, int j) {
        if (i >= 0 && j >= 0 && i < grid.length && j < grid[0].length && grid[i][j] == '1') {
            grid[i][j] = 'v';
            dfsFill(grid, i + 1, j);
            dfsFill(grid, i - 1, j);
            dfsFill(grid, i, j + 1);
            dfsFill(grid, i, j - 1);
        }
    }
}
