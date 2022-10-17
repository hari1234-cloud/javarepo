package com.arcus.IOstreams;

import java.io.File;
import java.io.IOException;

public class File1Prg {

	public static void main(String[] args) throws IOException {

		/*File f1 = new File("myarcuusdirectory");  // subdirectory
		f1.mkdir();
		
		File f2 = new File("MySubDir2","Myfile.txt");
		f2.createNewFile();*/
		
		File f = new File("MyFile2.txt");
		System.out.println(f.exists());
		f.createNewFile();
		
		System.out.println(f.exists());
		
		File f1 = new File("NewDirectory");
		f1.mkdir();
	}
}
