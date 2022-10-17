package com.arcus.functionalInterface;

public class ImplfaceHi implements Sayable {

	public static void main(String[] args) {
		ImplfaceHi obj = new ImplfaceHi();
		obj.says("Hello Their");
}

	public void says(String msg) {
		System.out.println(msg);

	}
}
