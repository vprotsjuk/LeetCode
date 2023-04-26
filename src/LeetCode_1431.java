package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_1431 {
    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3};
        List<Boolean> res = new ArrayList<>(candies.length);
        int ex = 3;
        int max = 0;
        for (int i = 0; i < candies.length; i++){
            max = Math.max(max, candies[i]);

        }
        for (int i = 0; i < candies.length; i++){
            if (candies[i] + ex >= max){
                res.add(i, true);
            }
            else {
                res.add(i, false);
            }
        }
        System.out.println(res);;
        List<Integer> l = new ArrayList<>();


    }
}
