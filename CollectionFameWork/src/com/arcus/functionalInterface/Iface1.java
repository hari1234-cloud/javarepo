package com.arcus.functionalInterface;

@FunctionalInterface
public interface Iface1 {
	
	//Single Abstract Methods
	
	public int method1(int i,int j);
	
	//public void add m1(int i,int j);
	
	default void method() {
		System.out.println("Default interface");
	}
	
	default void method3() {
		System.out.println("Default interface 1");
	}
	public static void smethod() {
		
		System.out.println("Static Interface");
		
	}

}
