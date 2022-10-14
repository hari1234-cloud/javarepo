package JavaPractice;

import java.util.Scanner;

public class Palindrome_Number {    //  A palindrome number is a number that is same after reverse

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		
		int num = sc.nextInt();
		
		int rev=0,rem;
		int b=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=(rev*10)+rem;
		}
		System.out.println("Reverse Number is :" +rev);
		if(b==rev)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not a Palindrome Number");
		}

	}

}
