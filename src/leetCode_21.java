package src;

import java.util.LinkedList;

public class leetCode_21 {
    public static void main(String[] args) {
        LinkedList<Integer> ls1 = new LinkedList<>();
        ls1.add(1);
        ls1.add(3);
        ls1.add(33);
        LinkedList<Integer> ls2 = new LinkedList<>();
        ls2.add(0);
        ls2.add(4);
        ls2.add(77);
        LinkedList<Integer> res = new LinkedList<>();
        while (ls1.size() > 0 || ls2.size() > 0){
            if (!ls1.isEmpty() && ls1.get(0) < ls2.get(0)  ){
                res.add(ls1.get(0));
                ls1.remove(0);
            }
            else {
                res.add(ls2.get(0));
                ls2.remove(0);
            }
        }
        System.out.println(res);
    }
}

