package JavaPractice;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String:");
		
		String str=sc.nextLine();
		
		String org_str=str; // we need to compare the string
		
		String rev="";
		
		int len=str.length(); 
		
		str.charAt(0);
		
		for(int i=len-1;i>=0;i--)  
		{
			rev=rev+str.charAt(i); 
			
		}
		//System.out.println(rev);  // First reverse and then compare two string
		
		if(org_str.equals(rev))
		{
			System.out.println(org_str+" is a Palindrome String");
		}
		else
		{
			System.out.println(org_str+" is not Palindrome String");
		}

	}

}
