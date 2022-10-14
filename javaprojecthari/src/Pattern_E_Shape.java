
public class Pattern_E_Shape {
	public static void main(String[] args) {
		int n=5;
		//i loop for rows
		for(int i=1;i<=n;i++)
		{
			// j loop for columns
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==3||i==5||j==1)
				System.out.print("* ");	
				else
				System.out.print(" ");
			}
		System.out.println("");
			
		}
	}
	

}
