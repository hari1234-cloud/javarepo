package com.arcus.javatraining.controlflow;

public class ContinueExample {

	public static void main(String[] args) {
		
		for (int j = 1; j <= 100; j++) {
			
			if (j % 2 == 0) {
				continue;
			}
			System.out.println(j);
		}
	}
}
