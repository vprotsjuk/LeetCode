package src;
//{{'1','1','1','1','0'},{'1','1','0','1','0'},
//        {'1','1','0','0','0'},{'0','0','0','0','0'}, {'0','0','1','0','0'},
//        {'0','0','1','0','0'}};
//[["1","1","0","0","0"],["1","1","0","0","0"],["0","0","1","0","0"],["0","0","0","1","1"]]

//[["1","0","1","1","1"],["1","0","1","0","1"],["1","1","1","0","1"]]

public class leetCode_200_2 {
    public static void main(String[] args) {
        char[][] field = {{'0', '0', '1', '0', '1'}, {'0', '1', '1', '0', '1'},
                {'1', '0', '1', '0', '1'}, {'1', '0', '1', '0', '0'}, {'1', '0', '0', '0', '0'}};

        char island = 'a';
        for (char[] chars : field) {
            System.out.println();
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
        }
        System.out.println();

        for (int a = 0; a < field.length; a++) {
            for (int b = 0; b < field[a].length; b++) {
                if (field[a][b] == '1') {
                    island = (char) (island + 1);
                    field[a][b] = island;
                }
                for (int i = 0; i < field.length; i++) {
                    for (int j = 0; j < field[i].length; j++) {
                        boolean currentIsOne = (field[i][j] == '1');
                        boolean upIsIsland = (i > 0 && field[i - 1][j] == island);
                        boolean leftIsIsland = (j > 0 && field[i][j - 1] == island);
                        boolean downIsIsland = (i < field.length - 1 && field[i + 1][j] == island);
                        boolean rightIsIsland = (j < field[i].length - 1 && field[i][j + 1] == island);
                        if ((currentIsOne && upIsIsland) || (currentIsOne && leftIsIsland)
                                || (currentIsOne && downIsIsland) || (currentIsOne && rightIsIsland)) {
                            field[i][j] = island;
                            if (i != 0 && j != 0) {
                                i--;
                                j--;
                            }

                        }
                    }
                }
            }
        }
        for (char[] chars : field) {
            System.out.println();
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
        }
        System.out.println();
        System.out.println(island - 'a');
    }
}
