package src;

public class leetCode_14 {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        if (strs.length == 0){
            System.out.println("");
        }
        String pref = strs[0];
        for (int i = 1; i < strs.length; i++){
            for (int j = 0; j < pref.length(); j++){
                if(j == strs[i].length() ||  strs[i].charAt(j) != pref.charAt(j)){
                    pref = pref.substring(0, j);
                }
            }
        }
        System.out.println(pref);
    }
}









