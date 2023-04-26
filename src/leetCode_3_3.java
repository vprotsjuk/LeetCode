package src;

import java.util.ArrayList;
import java.util.List;

public class leetCode_3_3 {
    public static void main(String[] args) {
        String s = s = "aaa";
//        String s = s = "qqww";
//        int currentXor = 0;
        long prewXor = 0;
        int tempRes = 0;
        int res = 0;

        long currentXor = 0;
//        if (s.length() == 0){
//            return 0;
//        }
//        if (s.length() == 1){
//            return 1;
//        }

        for (int i = 0; i < s.length(); i++) {
            currentXor ^= Math.abs(s.charAt(i) * (s.charAt(i)-96) *10)  ;
            if (prewXor < currentXor ){
                tempRes++;
                res = Math.max(res, tempRes);
                prewXor = currentXor;

            }
            else {
                tempRes =1;
                prewXor = currentXor;
//                i = i-1;
            }
        }



        System.out.println(res);
//        System.out.println(('a'-96)*10);
//        System.out.println(('b'-96)*10);
//        System.out.println(('c'-96)*10);
//        System.out.println('a' - 96);
//        System.out.println('b' - 96);
//        System.out.println('c' - 96);

//        System.out.println('a'*1);
//        System.out.println('a'*'a');
//        System.out.println(('a'*'a'));
//        System.out.println(('a'*'a')^('b'*'b'));
//        System.out.println(('a'*'a')^('b'*'b')^('c'*'c'));
//        System.out.println(('a'*'a')^('c'*'c')^('b'*'b')^('c'*'c'));
//        System.out.println(('c'*'c')^('b'*'b')^('c'*'c')^('b'*'b')^('a'*'a'));
//        System.out.println(('a'*'a')^('b'*'b')^('c'*'c')^('c'*'c')^('b'*'b')^('a'*'a'));


//        System.out.println("zzzzzzzzzzž");
//        System.out.println(1);
//        System.out.println(('d'*'d'*4000));
//        System.out.println(('d'*'d'*4000)^('b'*'b'*2000));
//        System.out.println(('b'*'b'*2000)^('d'*'d'*4000)^('b'*'b'*2000));
//        System.out.println();
//        System.out.println(('a'*'a'*1));
//        System.out.println(('a'*'a'*1)^('b'*'b'*2));
//        System.out.println(('a'*'a'*1)^('b'*'b'*2)^('c'*'c'*3));
//        System.out.println(('a'*'a'*10)^('b'*'b'*20)^('c'*'c'*30)^('a'*'a'*10));
//        System.out.println(('a'*'a'*10)^('b'*'b'*20)^('c'*'c'*30)^('a'*'a'*10)^('b'*'b'*20));
//        System.out.println(('a'*'a'*10)^('b'*'b'*20)^('c'*'c'*30)^('a'*'a'*10)^('b'*'b'*20)^('c'*'c'*30));
//        System.out.println();
////        System.out.println(~-0);
////        System.out.println(~2~4);
//        System.out.println(1*100);
//        System.out.println(1*100^2*200);
//        System.out.println(2*200^3*300);
//        System.out.println(2*200^3*300^1*100);
////        System.out.println(1?^4?^9^4^1);
//        System.out.println(3122^('a'*10));
//        System.out.println();
//        System.out.println(0 ^ 'b' * 20);
//        System.out.println(1*10^2*20^3*30^3*30);
//        System.out.println(1*10^2*20^3*30^3*30^2*20);
//        System.out.println(1*10^2*20^3*30^3*30^2*20^1*10);

//        System.out.println("zzzzzzzzzzž");
//        System.out.println(1);
//        System.out.println((1*10)^(2*20)^0);
//        System.out.println(1*10^2*20^3*30);
//        System.out.println(1*10^2*20^3*30^3*30);
//        System.out.println(1*10^2*10^3*10^3*10);
//        System.out.println(1*10^2*10^3*10^3*10^2*10);
//        System.out.println(1*10^2*10^3*10^3*10^2*10^1*10);



    }
}
