package com.arcus.functionalInterface;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizableDemo {

	public static void main(String[] args) throws IOException {
		
		String user = new String();
		
		user="Arcus";
		user.age=40;
		user.passwd = "arcus";
		
		FileOutputStream fos = new FileOutputStream("user.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		

		

	}

}
