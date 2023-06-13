package com.vishnu.stack;

import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		
		System.out.println(isBalanced("[{()}]"));

	}

	private static boolean isBalanced(String string) {
		Stack<Character> stack = new Stack<>();
		char[] charArray = string.toCharArray();
		for(char ch:charArray) {
			if(ch==')') {
				if(stack.peek()==')')
					stack.pop();
				else
					return false;
			}
				
			else if(ch==']') {
					
				}
			else if(ch=='}') {
						
					}
			stack.push(ch);
		}
		return true;
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
