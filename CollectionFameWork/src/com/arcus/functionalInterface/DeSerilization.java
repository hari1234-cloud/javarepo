package com.arcus.functionalInterface;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerilization {
	public static void main(String args[]) throws IOException,ClassNotFoundException{
		
		FileInputStream fis= new FileInputStream("user.jar");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student student = (Student)ois.readObject();
		
		
		
	}

}
