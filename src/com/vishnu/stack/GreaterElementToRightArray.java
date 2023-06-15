package com.vishnu.stack;

import java.util.Stack;

public class GreaterElementToRightArray {

	public static void main(String[] args) {
		
		int[] arr= {1,5,7,11,10,12};
		Stack<Integer> myStack = new Stack<>();
		
		int len=arr.length;
		myStack.push(-1);
		for(int i=len-2;i>=0;i--) {
				if(arr[i]<arr[i+1]) {
					myStack.push(arr[i+1]);
				}
				else {
					if(arr[i]<myStack.peek())
						myStack.push(myStack.peek());
					else {
						if(i==0)
							myStack.push(-1);
						else
						myStack.push(arr[i]);
					}
						
					
				}
		}

	}

}
