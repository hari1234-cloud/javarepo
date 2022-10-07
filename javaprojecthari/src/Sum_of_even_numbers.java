
public class Sum_of_even_numbers {

	public static void main(String[] args) {
		int sum=0,i;
		for (i=1;i<=10;i++)
		{
			if(i%2==1)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);

	}

}
