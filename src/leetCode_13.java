package src;

import java.util.HashMap;
import java.util.Map;
public class leetCode_13 {
    public static void main(String[] args) {
        romanToInt("MCMXCIV");
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res = 0;
        char current;
        char next;
        for (int i = 0; i < s.length()-1; i++){
            current = s.charAt(i);
            next = s.charAt(i+1);
            if (map.get(next) < map.get(current)){
                res += map.get(current);
            }
            else {
                res -= map.get(current);
            }
        }
        res = res + map.get(s.charAt(s.length()-1));
        System.out.println(res);
        return res;


    }
}
//        int res = 0;
//        char current;
//        char next;
//        for (int i = 0; i < s.length()-1; i++){
//            current = s.charAt(i);
//            next = s.charAt(i+1);
//            if (map.get(next) < map.get(current)){
//                res += map.get(current);
//            }
//            else {
//                res -= map.get(current);
//            }
//        }
//        res = res + map.get(s.charAt(s.length()-1));
//        System.out.println(res);
//        return res;
//
//    }
//}









