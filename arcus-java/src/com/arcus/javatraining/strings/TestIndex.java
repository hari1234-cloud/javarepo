//In the following program, called ComputeResult, what is the value of result after each numbered line executes?
package com.arcus.javatraining.strings;

public class TestIndex {
	public static void main(String[] args) {
		String original = "software";
		StringBuilder result = new StringBuilder("hi");
		int index = original.indexOf('a');
		System.out.println(result);

		/* 1 */ result.setCharAt(0, original.charAt(0));
		System.out.println(result);
		/* 2 */ result.setCharAt(1, original.charAt(original.length() - 1));
		System.out.println(result);
		/* 3 */ result.insert(1, original.charAt(4));
		System.out.println(result);
		/* 4 */ result.append(original.substring(1, 4));
		System.out.println(result);
		/* 5 */ result.insert(3, (original.substring(index, index + 2) + " "));
		System.out.println(result);

		System.out.println(result);
	}
}
