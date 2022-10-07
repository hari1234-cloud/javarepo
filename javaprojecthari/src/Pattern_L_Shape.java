
public class Pattern_L_Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		//i loop for rows
		for(int i=1;i<=n;i++)
		{
			// j loop for columns
			for(int j=1;j<=n;j++)
			{
				if(i==3||j==3)
				System.out.print("* ");	
				else
				System.out.print(" ");
			}
		System.out.println("");
			
		}

	}

}
