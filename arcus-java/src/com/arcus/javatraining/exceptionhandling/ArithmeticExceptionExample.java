package com.arcus.javatraining.exceptionhandling;

class ArithmeticExceptionExample {
	public static void main(String[] args) {
		doStuff();
	}

	public static void doStuff() {
		doMoreStuff();
	}

	public static void doMoreStuff() {
		System.out.println(10 / 0);
	}
}