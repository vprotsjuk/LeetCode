package src;

public class leetCode_1689 {
    public static void main(String[] args) {
        String n = "27346209830709182346";
        int max = 0;
        int last = 0;
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            last = Character.getNumericValue(c);
            max = Math.max(last, max);
        }
        System.out.println(max);
    }
}




//        long max = 0;
//        long last = 0;
//        long x = Integer.parseInt(n);
//        while (x > 0) {
//            last = x % 10;
//            if (last > max) {
//                max = last;
//            }
//            x /= 10;
//
//        }
//        System.out.println(max);
//
//    }
//}

