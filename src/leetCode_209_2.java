package src;

public class leetCode_209_2 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1};
        int target = 7;
        int left = 0;
        int right = 0;
        int tempSum = 0;
        int res = Integer.MAX_VALUE;
        while (right < nums.length ){
            tempSum += nums[right];
            while (tempSum >= target){
                res = Math.min(res, right - left);
                tempSum = tempSum - nums[left];
                left++;
            }
                right++;

        }if(res == Integer.MAX_VALUE) {
            System.out.println(0);
        }
        else {
            System.out.println(res);
        }

    }
}