package src;

public class leetCode_9 {
    public static void main(String[] args) {
        boolean res = isPalindrome(12321);
        System.out.println(res);
    }
    public static boolean isPalindrome(int x) {
        if (x == 0){
            return true;
        }
        if (x % 10 == 0){
            return false;
        }
        int reverse = 0;
        while (x > reverse){
            reverse = reverse * 10 + x % 10;
            x /= 10;

        }
        if (x == reverse || x == reverse / 10){
            return true;
        }
        else {
            return false;
        }

    }
}




