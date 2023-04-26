package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class leetCode_857_2_Cllass {
    public static void main(String[] args) {

        int[] quality = new int[]{45, 46,47,48,49,50};
        int[] wage = new int[]{776,554,443,667,889,776};
        int k = 5;



        double[] coefficient_Wage_Divide_Quality = new double[quality.length];
        double[] quality_Double = new double[quality.length];
        double[] wage_Double = new double[wage.length];
        for (int i = 0; i < quality.length; i++){
            quality_Double[i] = quality[i];
            wage_Double[i] = wage[i];
        }
        List<Double> minimum_Salary_List = new ArrayList<>();

        for (int i = 0; i < quality_Double.length; i++) {
            coefficient_Wage_Divide_Quality[i] = wage_Double[i] / quality_Double[i];
        }
        int i = 0;
        int j = 0;
        double quality_Multiplay_On_Coeff = 0;
        double result = Double.MAX_VALUE;
        while (j < quality_Double.length) {
            while (i < quality_Double.length) {
                double temp = quality_Double[i] * coefficient_Wage_Divide_Quality[j];
                if (quality_Double[i] * coefficient_Wage_Divide_Quality[j] >= wage_Double[i]) {
                    minimum_Salary_List.add(temp);
                }

                i++;
            }
            minimum_Salary_List.sort(Double::compareTo);
            for (int l = 0; l < k; ) {
                if (minimum_Salary_List.size() >= k) {
                    while (l < k) {
                        quality_Multiplay_On_Coeff += minimum_Salary_List.get(l);
                        l++;
                    }
                    if (quality_Multiplay_On_Coeff < result) {
                        result = quality_Multiplay_On_Coeff;
                    }
                }
                else {
                    break;
                }
            }
            j++;
            i = 0;
            quality_Multiplay_On_Coeff = 0;
            minimum_Salary_List.clear();
        }
        System.out.println(result);
    }
}




//class Solution {
//    public double mincostToHireWorkers(int[] quality, int[] wage, int K) {
//        List<Worker> workers = new ArrayList<>();
//
//        // Sort by ratio increasingly
//        Collections.sort(workers, (a, b) -> (a.ratio - b.ratio));
//
//        // Maxheap always pop highest quality
//        PriorityQueue<Worker> maxHeap = new PriorityQueue<>((a, b) -> (b.quality - a.quality));
//
//        int totalQuality = 0;
//        for (Worker worker : workers) {
//            maxHeap.offer(worker);
//            totalQuality += worker.quality;
//
//            if (maxHeap.size() > K) {
//                Worker w = maxHeap.poll();
//                totalQuality -= w.quality;
//            }
//
//            if (maxHeap.size() == K) {
//                minCost = Math.min(totalQuality * worker.ratio, minCost);
//            }
//        }
//
//        return minCost;
//    }
//
//    class Worker {
//        int quality;
//        int wage;
//        int ratio;
//
//        public Worker(int quality, int wage) {
//            this.quality = quality;
//            this.wage = wage;
//            ratio = wage[i] / quality[i];
//        }
//    }
//}


