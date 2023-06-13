package com.vishnu.stack;

import java.util.Stack;

public class SortStackElements {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		stack.push(5);
		stack.push(3);
		stack.push(0);
		stack.push(2);
		stack.push(11);
		stack.push(9);
		stack.push(2);
		
		System.out.println(SortStack(stack));

	}

	private static Stack<Integer> SortStack(Stack<Integer> stack) {
		
		if(stack.isEmpty())
			return stack;
		
		int pop=stack.pop();
		SortStack(stack);
		if(stack.isEmpty() ||(!stack.isEmpty()&& stack.peek()<=pop))
			stack.push(pop);
		else {
			popToPush(stack,pop);
		}
		return stack;
			
	}

	private static void popToPush(Stack<Integer> stack, int elementToBePushed) {
		
		if(stack.isEmpty() || stack.peek()<=elementToBePushed) {
			stack.push(elementToBePushed);
			return;
		}
		
		int pop=stack.pop();
		
		popToPush(stack,elementToBePushed);
		stack.push(pop);
		
	}

}
