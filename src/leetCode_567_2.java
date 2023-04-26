package src;

public class leetCode_567_2 {
    public static void main(String[] args) {
        String s1 = "abc";

        String s2 = "abcde";
        int sum1 = 0;
        int sum2 = 0;
        int l = 0;
        int r = s1.length();
        for (int i = 0; i < s1.length(); i++) {
            sum1 += Math.pow(s1.charAt(i), 2);
            sum2 += Math.pow(s2.charAt(i), 2);
        }
        if (sum1 == sum2){
            System.out.println("true");
        }
        else {
            while (r < s2.length()) {
                sum2 = (int) (sum2 - Math.pow(s2.charAt(l), 2));
                l++;
                sum2 = (int)(sum2 + Math.pow(s2.charAt(r), 2));
                r++;
                if (sum1 == sum2) {
                    System.out.println("true");
                    break;
                }


            }
            if (sum1 != sum2){
                System.out.println("false");
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}