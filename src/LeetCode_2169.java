package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode_2169 {
    public static void main(String[] args) {
        int num = 2932;

        List<Integer> list = new ArrayList<>();
        while (num > 0){
            list.add(num % 10);
            num /= 10;
        }

        Collections.sort(list);
        System.out.println((list.get(0)*10 + list.get(3)) + (list.get(1)*10 + list.get(2)));
        int [] r = {1,2,3,4};
        for (int i : r){

        }
    }


}
