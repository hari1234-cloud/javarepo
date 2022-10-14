package JavaPractice;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Row of Size:");
		
		int rowsize=sc.nextInt();
		
		System.out.println("Enter Column of size");
		
		int colsize = sc.nextInt();
		int a[][] = new int[rowsize][colsize];
		
		System.out.println("Enter the elements:");
		
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<colsize;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<colsize;j++) {
				System.out.println("Value at["+i+"]["+j+"]th :" +a[i][j]);
			}
		}
	}
}
