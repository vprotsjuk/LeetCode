package src;

import java.util.*;

public class LeetCode_2545 {
    public static void main(String[] args) {


    }
}

//        int[][] score = {{10, 6, 9, 1}, {7, 5, 11, 2}, {4, 8, 3, 15}};
//        int k = 2;
//
//        for (int i = 0; i < score.lemgth; i++) {
//            for (int j = 0; j < score[0].length; j++) {
//                if (score[i][k] < score[i + 1][k]) {
//                    sort(score, i, i + 1);
//                }
//            }
//
//        }
//    }


//        public int[][] sort(int[][]score, int row1, int row2){
//
//            for(int i = row1; i < score.lemgth; i++){
//                for (int j = row2; j < score[0].length; j++){
//                    int[] temp = score[i][j];
//                    score[i][j] = score[i+1][j];
//                    score[i+1][j] = temp;
//                }
//            }








//        List <Integer> list = new ArrayList<>();
//        int [][] res = new int[score.length][score[0].length];
//        for (int i = 0; i < score.length; i++){
//            list.add(score[i][k]);
//        }
//        Collections.sort(list);
//        Collections.reverse(list);
//        for (int i = 0; i < list.size(); i++){
//            for(int j = 0; j< list.size(); j++) {
//                if(list.get(i) == score[j][k]){
//                    res[i] = score[j];
//                }
//            }
//        }
//        for (int i = 0; i < res.length; i++){
//            System.out.println();
//            for (int j = 0; j < res[i].length; j++){
//                System.out.print(res[i][j] + " ");
//            }
//        }
//        System.out.println();
//
//    }
//}
