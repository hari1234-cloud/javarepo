package JavaPractice;

import java.util.*;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		
		//Approach 1 
		/*String sr = "WellCome to Java"; // Orginal String
		
		String[] words = sr.split(" "); //Spliting string into words.
		
		String reverseString="";
		for(String w:words)    // Wellcome
		{
			String reverseword="";
			for(int i=w.length()-1;i>=0;i--)  // Wellcome
			{
				reverseword=reverseword+w.charAt(i);
			}
			reverseString = reverseString+reverseword+" ";  //emoclleW oT aVaJ
			
		}
		System.out.println(reverseString);*/
		
		
		// Approach 2 by using string builder
		
		String str = " Welcome to Java";
		String[] words = str.split("\\s");  // space will split
		
		String reverseword="";
		for(String w : words)
		{
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			
			reverseword=reverseword+sb.toString()+" ";
			
		}
		System.out.println(reverseword);
		
		
		

	}

}
