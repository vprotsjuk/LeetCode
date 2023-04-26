package src;

import java.util.ArrayList;
import java.util.Arrays;
public class leetCode_735 {
    public static void main(String[] args) {
        int[] asteroids = new int[]{50, -2, -1, 1, -2,-10};
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                temp.add(asteroids[i]);
            } else if (asteroids[i] < 0) {
                if (temp.size() == 0) {
                    temp.add(asteroids[i]);
                    continue;
                } else if (temp.get(temp.size() - 1) < 0) {
                    temp.add(asteroids[i]);
                    continue;
                } else if (temp.get(temp.size() - 1) > 0 & (temp.get(temp.size() - 1) * -1 > asteroids[i])) {
                    temp.remove(temp.size() - 1);
                    i -=1;
                    continue;
                } else if (temp.get(temp.size() - 1) > 0 & (temp.get(temp.size() - 1) * -1 == asteroids[i])) {
                    temp.remove(temp.size() - 1);
                    continue;
                }
                if (temp.get(temp.size() - 1) < 0 & (temp.get(temp.size() - 1) == asteroids[i])) {
                    temp.add(asteroids[i]);
                }
            }
        }
        int[] res = new int[temp.size()];
        for (int j = 0; j < temp.size(); j++) {
            res[j] = temp.get(j);
        }
        System.out.println(temp);
        System.out.println(Arrays.toString(res));
    }
}

