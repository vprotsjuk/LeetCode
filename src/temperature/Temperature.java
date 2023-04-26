package src.temperature;

import java.util.Arrays;
import java.util.Stack;

public class Temperature {
    public static void main(String[] args) {
        int[] temp = {21, 9, 76, 45, 34, 74, 14, 65, 33, 27, 94, 27};
        int[] ans = new int[temp.length];
        Stack<Pair> stack = new Stack<>();

        for (int i = temp.length -1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek().value <= temp[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                ans[i] = stack.peek().index - i;
            }
            stack.push(new Pair(temp[i], i));
        }
        System.out.println(Arrays.toString(ans));
    }
}
class Pair {
    int value;
    int index;

    Pair(int value, int index) {
        this.value = value;
        this.index = index;
    }
}
