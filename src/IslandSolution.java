package src;

public class IslandSolution {
    public static void main(String[] args) {
        int [][] field = {{1,0,0,0,1,0,0,0,0,0}, {0,1,1,1,1,1,1,1,1,1},
                {0,0,1,0,1,0,0,0,0,0}, {1,1,0,0,0,0,0,0,0,0},
                {1,0,1,1,1,0,0,0,0,0}, {1,0,0,0,1,1,0,0,0,0}};
        int count = 0;
        for(int i = 0; i < field.length; i++){
            System.out.println();
            for (int j = 0; j < field[i].length; j++){
                System.out.print(field[i][j] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++){
                if (i == 0 || i == field.length-1 || j == 0 || j == field[i].length-1){
                    if (field[i][j] == 1){
                        field[i][j] = 2;
                    }
                }
            }
        }
        while (count < field.length) {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if ((i > 0 && field[i - 1][j] == 2 && field[i][j] == 1) || (i < field.length - 1 && field[i + 1][j] == 2 && field[i][j] == 1)
                            || (j > 0 && field[i][j - 1] == 2 && field[i][j] == 1) || (j < field[i].length - 1 && field[i][j + 1] == 2 && field[i][j] == 1)) {
                        field[i][j] = 2;
                    }
                }
            }
            count++;
        }
        for(int i = 0; i < field.length; i++){
            for (int j = 0; j < field[i].length; j++){
                if (field[i][j] == 1){
                    field[i][j] = 0;
                }
                if (field[i][j] == 2){
                    field[i][j] = 1;
                }

            }
        }

        for(int i = 0; i < field.length; i++){
            System.out.println();
            for (int j = 0; j < field[i].length; j++){
                System.out.print(field[i][j] + " ");
            }
        }

    }
}
