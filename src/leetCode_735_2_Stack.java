package src;

import java.util.Arrays;
import java.util.Stack;
public class leetCode_735_2_Stack {
    public static void main(String[] args) {
        int[] asteroids = new int[]{8,8,-100, -200};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0 ) {
                stack.push(asteroids[i]);
            } else if (asteroids[i] < 0) {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroids[i])){
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() == Math.abs(asteroids[i])){
                    stack.pop();
                }
                else if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroids[i]);
                }
            }
        }
        System.out.println(stack);
        int[] result = new int[stack.size()];
        for (int j = stack.size()-1; j >=0; j--) {
            result[j] = stack.pop();
        }
        System.out.println(stack);
        System.out.println(Arrays.toString(result));
    }
}



