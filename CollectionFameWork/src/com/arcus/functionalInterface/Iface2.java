package com.arcus.functionalInterface;

@FunctionalInterface
public interface Iface2 {
	
	public String add(int i,int j);
	
	//public String add(int i,int j);
	
	default void method(int i, int j) {
		System.out.println("D");
	}
	

}
