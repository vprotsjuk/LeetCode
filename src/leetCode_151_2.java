package src;

import java.util.Arrays;
import java.util.Collections;

public class leetCode_151_2 {
    public static void main(String[] args) {
        String s = " Hello!   World   ";
        String [] res = s.trim().split(" +");
        System.out.println(Arrays.toString(res));
        Collections.reverse(Arrays.asList(res));
        System.out.println(String.join("+", res));
    }
}
