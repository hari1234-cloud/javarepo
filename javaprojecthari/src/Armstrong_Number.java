
public class Armstrong_Number {

	public static void main(String[] args) {
		int num=121,rev=0,rem;
		int temp=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev+(rem*rem*rem);
		}
		System.out.println("Reverse Number is: " +rev);
		if(temp==rev)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not a Armstrong Number");
		}
	}
}
