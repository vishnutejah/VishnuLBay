package com.vishnu.stack;

import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {	
		System.out.println(isBalanced("[{()}]"));
	}
	    public boolean isValid(String brackets) {
	        Stack<Character> stack = new Stack<>();
	        char[] chars = brackets.toCharArray();
	        for(char c : chars) {
	            if(c == '(')
	                stack.push(')');
	            else if(c == '{')
	                stack.push('}');
	            else if(c == '[')
	                stack.push(']');
	            else {
	                if(stack.isEmpty() || stack.pop() != c) {
	                    return false;
	                }
	            }
	        }
	        return stack.isEmpty();
	    }
	}
