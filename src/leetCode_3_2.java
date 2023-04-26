package src;

import java.util.HashSet;
import java.util.Set;

public class leetCode_3_2 {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();
        int l = 0;
        String s = "bcatna";

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                int size = set.size();
                res = Math.max(size, res);
            }
            else {
                set.remove(s.charAt(l++));
                i = i -1;
            }

        }
        System.out.println(res);
        System.out.println(set);
    }
}
