package JavaPractice;

import java.util.Scanner;

public class CountOfEvenandOddNumberDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int num=sc.nextInt();
		int even=0;
		int odd=0;
		
		while(num>0)   //1234  123  12  1
		{
			int rem=num%10;  //4  3  2   1
			if(rem%2==0)
			{
				even++;   //1  2
				
			}
			else
			{  
				odd++;  //1  2 
			}
			num=num/10;  //123   12  1   0
			
		}
		System.out.println("Number of even Number:" +even);
		System.out.println("Number of odd Number:" +odd);
		
	}

}
