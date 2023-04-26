package src;

public class leetCode_13_1 {
    public static void main(String[] args) {
        romanToInt("MCMXCIV");
    }
    public static int romanToInt(String s) {
        int curr = 0;
        int prev = 0;
        int res = 0;
        for (int i = s.length()-1; i >= 0; i--){
            switch(s.charAt(i)){
                case 'I' -> curr = 1;
                case 'V' -> curr = 5;
                case 'X' -> curr = 10;
                case 'L' -> curr = 50;
                case 'C' -> curr = 100;
                case 'D' -> curr = 500;
                case 'M' -> curr = 1000;
            }
            if (prev > curr){
                res -= curr;
            }
            else{
                res += curr;
                prev = curr;
            }
        }
        System.out.println(res);
        return res;
    }
}
