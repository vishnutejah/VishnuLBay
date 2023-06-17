package com.vishnu.stack;

import java.util.Stack;

public class StockSpan {
    //100 80 80 70 60 75 85
    public static void main(String[] args) {
        int [] arr ={100,80,80,70,60,75,85};
        arr=stockSpan(arr);
        for(int i:arr)
        System.out.println(i);
    }

    public static int[] stockSpan(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        result[0] = 1;
        for (int i = 1; i < arr.length; i++) {

            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                stack.pop();
            }
            int len = i - (stack.isEmpty() ? 0 : stack.peek());
            stack.push(i);
            result[i] = len;
        }
        return result;
    }
}
