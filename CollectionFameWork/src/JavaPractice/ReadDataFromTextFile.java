package JavaPractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class ReadDataFromTextFile {
	
	public static void main(String args[]) throws IOException  {
		
		// Approach 1 Using FileReader Bufferrreader
		/*FileReader fr =new FileReader("C:\\Java\\Test.txt");
		
		BufferedReader br =new BufferedReader(fr);
		
		String str;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();*/
		
		//Approach 2 : Using Scanner File
		
		File file = new File("C:\\Java\\Test.txt");
		Scanner sc = new Scanner(file);
		
		//loop statement
		/*while(sc.hasNext())
		{
			System.out.println(sc.nextLine());
		}*/
		
		//Approach 3
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
		
}

}
