package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class leetCode_857 {
    public static void main(String[] args) {

        double[] quality = new double[]{45, 46,47,48,49,50};
        double[] wage = new double[]{776,554,443,667,889,776};
        int k = 5;


        double[] koef = new double[quality.length];
        List<Double> salary_List = new ArrayList<>();

        for (int i = 0; i < quality.length; i++) {
            koef[i] = wage[i] / quality[i];
        }
        int i = 0;
        int j = 0;
        double temp_2 = 0;
        double temp_3 = 10000000;
        while (j < quality.length) {
            while (i < quality.length) {
                double temp = quality[i] * koef[j];
                if (quality[i] * koef[j] >= wage[i]) {
                    salary_List.add(temp);
                }
                salary_List.sort(Double::compareTo);
                i++;
            }
            for (int l = 0; l < k; ) {
                if (salary_List.size() >= k) {
                    while (l < k) {
                        temp_2 += salary_List.get(l);
                        l++;
                    }
                    if (temp_2 < temp_3) {
                        temp_3 = temp_2;
                    }
                }
                else {
                    break;
                }
            }
            j++;
            i = 0;
            temp_2 = 0;
            salary_List.clear();
        }
        System.out.println(temp_3);
    }
}


