package src;

public class LeetCode_2535 {
    public static void main(String[] args) {
        int [] nums = {1, 15, 6, 3};
        int elSum = 0;
        int digSum = 0;
        for (int i = 0; i < nums.length; i++){
            elSum += nums[i];
            while(nums[i] >= 1){
                digSum += nums[i] % 10;
                nums[i] = nums[i]/10;
            }
        }
        System.out.println(elSum - digSum);;
    }

}
