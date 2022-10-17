package com.arcus.functionalInterface;

@FunctionalInterface

public interface Sayable {
	
	void says (String msg);
	
	String toString();
	
	//boolean equals(object obj);
	
	
	default void method1(int i, int j) {
		System.out.println("Default Interface");
	}
	
	static void add(String s) {
		System.out.println("Static Method");
	}

}
