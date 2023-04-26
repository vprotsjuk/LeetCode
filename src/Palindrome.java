package src;

public class Palindrome {
    static int max = 0;
    static int max2 = 0;
    static int lMin = Integer.MAX_VALUE;
    static int lMin2 = Integer.MAX_VALUE;

    private static void expandFromMiddle(int l, int r, String s) {
        while (l >= 0 && r < s.length()) {
            if (s.charAt(l) != s.charAt(r)) {
                return;
            }
            int temp = r - l + 1;
            if (temp > max) {
                max = temp;
                lMin = l;
            }
            l--;
            r++;
        }
    }

    public static void main(String[] args) {
        String s = "ababababab";
        for (int i = 0; i < s.length(); i++) {
            expandFromMiddle(i, i, s);
            expandFromMiddle(i, i+1, s);
        }
        if (max2 > max) {
            System.out.println("lMin2 = " + lMin2);
            System.out.println("min2 = " + max2);
            String resultString2 = s.substring(lMin2, lMin2 + max2);
            System.out.println("Palindrome length is " + max2);
            System.out.println("Array contains that palindrome " + resultString2);
        } else {
            System.out.println(lMin);
            System.out.println(max);
            String resultString = s.substring(lMin, lMin + max);
            System.out.println("Palindrome length is " + max);
            System.out.println("Array contains that palindrome " + resultString);
        }
        int a = 8;
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a++ + ++a);
        int c = 7;
        int b = a++ + ++c + a + ++a + --c;
        System.out.println(b);

    }
}
