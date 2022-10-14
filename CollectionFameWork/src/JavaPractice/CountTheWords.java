package JavaPractice;
import java.util.*;

public class CountTheWords {

	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();  // Wellcome to java
		
		int count=1;
		
		for(int i=0;i<s.length()-1;i++)
		{ 
			if((s.charAt(i)==' ' ) && (s.charAt(i+1)!=' '))  //  // ' ' space + after should not space
			{
				count++;
			}
		}
		
		 System.out.println("Number of words in a Stirng:" +count);
		
	}

}
