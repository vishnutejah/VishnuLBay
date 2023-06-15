package com.vishnu.stack;

import java.util.Stack;

class MinStack {
	
	public static void main(String[] args) {
		MinStack stack=new MinStack();
		stack.push(4);
		stack.push(3);
		stack.push(2);
		
		System.out.println(stack.top());
		System.out.println(stack.getMin());
		
		stack.push(7);
		stack.push(8);
		stack.push(1);
		
		System.out.println(stack.getMin());
		
		stack.push(0);
		
		System.out.println(stack.getMin());
	}
	
    Stack<Integer> mainStack=null;
    Stack<Integer> minStack=null;

    public MinStack() {
         mainStack= new Stack<>();
         minStack= new Stack<>();
    }
    
    public void push(int val) {
        if(mainStack.isEmpty()){
            mainStack.push(val);
            minStack.push(val);
        }else{
            if(val<minStack.peek()){
                minStack.push(val);
            }else{
                minStack.push(minStack.peek());
            }
            mainStack.push(val);
        }
    }
    
    public void pop() {
        mainStack.pop();
        minStack.pop();
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
