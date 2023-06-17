package com.vishnu.stack;

import java.util.Stack;

public class LargestAreaHistogram {

    public static void main(String[] args) {
        System.out.println(largestRectangleArea(new int[]{2,1,5,6,2,3}));
    }

    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int i = 0;
        while (i < heights.length) {
            if (stack.isEmpty() || heights[stack.peek()] <= heights[i]) {
                stack.push(i++);
            } else {
                while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                    int currentBarIndex=stack.pop();
                    int leftBound = stack.isEmpty() ? -1 : stack.peek();
                    int area = heights[currentBarIndex] * (i - leftBound - 1);
                    maxArea = Math.max(area, maxArea);
                }
            }
        }

        while(!stack.isEmpty()) {
            int rightBound = i;
            int currentBarIndex = stack.pop();
            int leftBound = stack.isEmpty() ? -1 : stack.peek();
            int area = heights[currentBarIndex] * (rightBound - leftBound - 1);
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
}
