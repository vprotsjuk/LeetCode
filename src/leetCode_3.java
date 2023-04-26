package src;

import java.util.ArrayList;
import java.util.List;

public class leetCode_3 {
    public static void main(String[] args) {
        String s = s = "dvdf";

        int l = 0;
        int r = l;
        int count = 0;
        String temp = "";
        int res = Integer.MIN_VALUE;
        while (r < s.length()) {
            if (temp.indexOf(s.charAt(r)) < 0) {
                count++;
                temp = temp + s.charAt(r);
                r++;

            } else {
                count = 0;
                l++;
                temp = "";
                r = l;

            }
            res = Math.max(res, count);
        }
        System.out.println(res == Integer.MIN_VALUE ? 0 : res);
    }

}


