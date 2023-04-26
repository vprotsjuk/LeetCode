package src;

public class leetCode_14_1 {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        String output = strs[0];
        for (int i = 1; i < strs.length; i++){
            for (int j = 0; j < output.length(); j++){
                if (j == strs[i].length() || strs[i].charAt(j) != output.charAt(j)){
                    output = output.substring(0, j);
                }
            }

        }
        System.out.println(output);

    }
}




class Solution {

    public String longestCommonPrefix(String[] arr) {
        if(arr.length == 0)
            return "";

        int min = findShortest(arr);
        char c;
        String ans = "";



        for(int i = 0; i < min; i++){
            c = arr[0].charAt(i);
            for(String st : arr){
                if(st.charAt(i) != c)
                    return ans;
            }
            ans+= Character.toString(c);
        }
        return ans;
    }

    public int findShortest(String[] arr){
        int min = arr[0].length();
        for(int i =0; i< arr.length; i++){
            if(arr[i].length() < min)
                min = arr[i].length();
        }
        return min;
    }
}