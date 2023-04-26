package src;
//{{'1','1','1','1','0'},{'1','1','0','1','0'},
//        {'1','1','0','0','0'},{'0','0','0','0','0'}, {'0','0','1','0','0'},
//        {'0','0','1','0','0'}};
//[["1","1","0","0","0"],["1","1","0","0","0"],["0","0","1","0","0"],["0","0","0","1","1"]]

//[["1","0","1","1","1"],["1","0","1","0","1"],["1","1","1","0","1"]]

public class leetCode_200 {
    public static void main(String[] args) {
        char [][] field =  {{'1','0','1','1','1'},{'1','0','1','0','1'},
                {'1','1','1','0','1'}, };
        char island = 'a';
        int count = 0;
        for(int i = 0; i < field.length; i++){
            System.out.println();
            for (int j = 0; j < field[i].length; j++){
                System.out.print(field[i][j] + " ");
            }
        }
        System.out.println();
        for (int a = 0; a < field.length; a++) {
            for (int b = 0; b < field[a].length; b++){
                if (field[a][b] == '1'){
                    island = (char) (island + 1);
                    field[a][b] = island;
                }
                while (count < Math.max(field.length, field[0].length)) {
                    for (int i = 0; i < field.length; i++) {
                        for (int j = 0; j < field[i].length; j++) {
                            if ((i > 0 && field[i - 1][j] == island && field[i][j] == '1')
                                    || (j > 0 && field[i][j - 1] == island && field[i][j] == '1')
                                    || (i < field.length - 1 && field[i + 1][j] == island && field[i][j] == '1')
                                    || (j < field[i].length - 1 && field[i][j + 1] == island && field[i][j] == '1')) {
                                field[i][j] = island;
                            }
                        }
                    }
                    count++;
                }
                count = 0;

            }
        }
        for(int i = 0; i < field.length; i++){
            System.out.println();
            for (int j = 0; j < field[i].length; j++){
                System.out.print(field[i][j] + " ");
            }

        }
        System.out.println(island - 'a');

    }
}
