package src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leetCode_442 {
    public static void main(String[] args) {
        int [] nums = {1,2, 3,4,5,5,6, 2};

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i])-1;
            if (nums[index] < 0) {
                res.add(Math.abs(index + 1));
            }
            nums[index] = -nums[index];
        }
        System.out.println(res);
//
//
//
//        System.out.println(res);




//        Set<Integer> set = new HashSet<>();
//        ArrayList<Integer> res = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++){
//            if (!set.contains(nums[i])){
//                set.add(nums[i]);
//            }
//            else{
//                res.add(nums[i]);
//            }
//        }
//        System.out.println(res);
    }
}
