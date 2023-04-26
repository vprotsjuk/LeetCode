package src;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_392 {
    public static void main(String[] args) {
        String s = "bc";
        String t = "awbwcw";
        int counter = 0;
        Map<Integer, Integer> map = new HashMap<>();

//        System.out.println(s.substring(0, 3));
        for(int i = 0; i < s.length(); ){
            if(t.indexOf(s.charAt(0)) >= 0){
                System.out.println(counter++);

                t = t.substring(t.indexOf(s.charAt(0))+1);
                s = s.substring(1);

                if (s.length() > t.length()){
                    System.out.println("no");
                    break;
                }
            }
            else {
                System.out.println("no");
                break;
            }
        }
        System.out.println("yes");
    }
}

