package JavaPractice;

public class SwapingOfNumbers {

	public static void main(String[] args) {
		// With Variable 
		int a=10;
		int b=20;
		System.out.println("Before Swapping of Two Numbers:"+a+" "+b);
		
		/*int t=a;
		a=b;
		b=t;*/
		
		//Without Using Variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping of Two Numbers:"+a+" "+b);
		
	
		
	}

}
