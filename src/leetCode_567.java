package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetCode_567 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "ooolleooole";
        String s1Sorted = sort(s1);
        int sum1 = 0;
        int sum2 = 0;
        int l = 0;
        int r = s1Sorted.length();
        for (int i = 0; i < s1Sorted.length(); i++) {
            sum1 += s1Sorted.charAt(i);
        }
        while (r <= s2.length()){
            for (int i = l; i < r; i++) {
                sum2 += s2.charAt(i);
            }
            if (sum1 == sum2){
                String s2Sorted = sort(s2.substring(l, r));
                if (s1Sorted.equals(s2Sorted)){
                    System.out.println("true");
                    break;
                }
            }
            l++;
            r++;
            sum2 = 0;
        }
        System.out.println("false");
    }
    public static String sort(String s){
        char[] t = s.toCharArray();
        Arrays.sort(t);
        return new String(t);
    }
}
