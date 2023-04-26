package src;

public class LeetCode_392_2 {
    public static void main(String[] args) {
        String s = "abc";
        String t = "awbwcw";
        double sSum = 0;
        double tSum = 0;
        double n = 0;
        double sl = (double) s.length();
        double tl = (double) t.length();
        for (int i = 0; i < s.length(); i++){
            sSum += s.charAt(i) + ++n;
        }
        for (int i = 0; i < t.length(); i++){
            tSum += t.charAt(i);
        }
        double rest = tSum - sSum;
        System.out.println("sSum " + sSum);
        System.out.println("tSum " + tSum);
        System.out.println("rest " + rest);
        System.out.println();
        double res = rest / (tl - sl);
        System.out.println(res);

    }
}
