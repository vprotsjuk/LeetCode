package src;

public class leetCode_520 {
    public static void main(String[] args) {
        String word = "Aaa";
        int cap = 0;
        for(int i = 0;i<word.length();i++){
            if(word.charAt(i) < 97)
            cap++;
        }
        if(cap == 0 || cap == word.length() || (cap == 1 && word.charAt(0) < 97))
            System.out.println("true");
        System.out.println("false");
    }
}





//        int i = 0;
//        while (i < word.length()){
//            if (word.charAt(i) >= 97 && word.charAt(i) <= 122  ){
//                i++;
//                if (i == word.length()){
//                    System.out.println("true");
//                }
//            }
//            else{
//                break;
//            }
//        }
//        i = 0;
//        while (i < word.length()){
//            if (word.charAt(i) >= 65 && word.charAt(i) <= 90  ){
//                i++;
//                if (i == word.length()){
//                    System.out.println("true");
//                }
//            }
//            else {
//                break;
//            }
//        }
//        i = 0;
//        while (i < word.length()-1){
//            if (word.charAt(0) >= 65 && word.charAt(0) <= 90 &&
//                    word.charAt(i+1) >= 97 && word.charAt(i+1) <= 122){
//                i++;
//                if (i == word.length()-1){
//                    System.out.println("true");
//                }
//            }
//            else {
//                break;
//            }
//        }
//        System.out.println("false");
//    }
//}

