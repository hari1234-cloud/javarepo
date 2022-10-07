
public class Palindrome_Number {

	public static void main(String[] args) {
	int a=545,rev=0,rem;
	int b=a;
	while(a>0)
		{
		rem=a%10;
		a=a/10;
		rev=(rev*10)+rem;
		}
		System.out.println("Reverse number is: " +rev);
		if(b==rev)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not a palindrome number");
		
		}

	}

}
