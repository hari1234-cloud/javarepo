package JavaPractice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDatIntoTextFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Java\\test123.txt");
		BufferedWriter bw =new BufferedWriter(fw);
		
		bw.write("Java for new begineers");
		bw.newLine();
		bw.write("Core Jav");
		bw.newLine();
		bw.write("Advance JAVA");
		bw.newLine();
		
		System.out.println("Finished!!!!");
		
		bw.close();
	}

}
