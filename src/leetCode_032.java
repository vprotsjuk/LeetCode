package src;

import java.util.ArrayList;

public class leetCode_032 {
    public static void main(String[] args) {

        String s = "(())))((())";
        ArrayList<Character> temp = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            temp.add(s.charAt(i));
        }
        ArrayList<Integer> temp2 = new ArrayList<>();
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) == '(') {
                temp2.add (   '(' - 39   ) ;
            } else {
                temp2.add((')' - 42));
            }
        }
        temp2.add(temp2.size(), 9);
        System.out.println(temp2);
        int lenth = temp2.size();
        int count = 0;
        int sumMax = 0;

        for (int i = 0; i < lenth - 2; i++) {
            if (temp2.get(i) == 1 && temp2.get(i + 1) == -1) {
                temp2.set(i, 0);
                temp2.set(i + 1, 0);
            }
        }
        int w = 0;
        for (int i = 0; i < lenth - 2; i++) {
            for (w = 0; w < lenth - 2; w++) {
                if (temp2.get(i) == 9 || temp2.get(w) == 9) { // 9999999999

                    break;
                }
                if (temp2.get(i) == 0) {
                    i++;
                    continue;
                }
                if (temp2.get(i) == -1) {
                    i++;
                    continue;
                }
                if (temp2.get(i) == 1 && (temp2.get(i + 1) != 0)) {
                    i++;
                    continue;
                }
                if (temp2.get(i) == 1 && (temp2.get(i + 1) == 0)) {
                    while (temp2.get(i) + temp2.get(w) != 0) {
                        w++;
                        if (temp2.get(i) == 9 || temp2.get(w) == 9) { // 9999999999
                            break;
                        }
                        if (temp2.get(i) + temp2.get(w) == 1) {
                            continue;
                        }
                        if (temp2.get(i) + temp2.get(w) == 2) {
                            i = w;
                            continue;
                        }
                        if (temp2.get(i) + temp2.get(w) == 0) {
                            temp2.set(i, 0);
                            temp2.set(w, 0);
                            i = 0;
                            w = i;
                            break;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < lenth; i++) { // Block count
            if (temp2.get(i) == 0) {
                count++;
            } else {
                count = 0;
            }
            if (count > sumMax) {
                sumMax = count;
            }
        }
        System.out.println(temp2);
        System.out.println(sumMax);
    }
}

