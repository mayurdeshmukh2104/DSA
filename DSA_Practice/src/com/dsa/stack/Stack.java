package com.dsa.stack;

public class Stack {

	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX];
	
	boolean isEmpty() {
		return (top < 0);
	}
	
	Stack(){
		top = -1;
	}
	
	boolean push(int data) {
		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a[++top] = data;
			System.out.println(data +" pushed into stack");
			return true;
		}
	}
	
	private int pop() {
		if(top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top--];
			return x;
		}
	}
	
	private int peek() {
		if(top<0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top];
			return x;
		}
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println("Peek: "+stack.peek());
		System.out.println("Popped: "+stack.pop());
		System.out.println("Peek: "+stack.peek());
		System.out.println("Popped: "+stack.pop());
		System.out.println("Peek: "+stack.peek());
		System.out.println("Popped: "+stack.pop());
		System.out.println("Peek: "+stack.peek());
		//Underflow below
//		System.out.println("Popped: "+stack.pop());
//		System.out.println("Peek: "+stack.peek());
	}

}
