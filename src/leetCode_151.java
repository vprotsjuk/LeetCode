package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class leetCode_151 {
    public static void main(String[] args) {

        String s = "  hello world  ";
        s = s.trim();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length()-1 && s.charAt(i) == ' ' && s.charAt(i+1) == ' ') {
                continue;
            } else {
                res += s.charAt(i);
            }
        }
        String[] resultArr = res.split(" ");
        String reverse = "";
        for (int i = resultArr.length-1; i >= 0; i--){
            reverse += (resultArr[i]);
            reverse += " ";
        }
         reverse = reverse.substring(0, reverse.length() - 1);
        System.out.println(reverse);
    }
}
