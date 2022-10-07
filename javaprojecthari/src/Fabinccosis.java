
public class Fabinccosis {

	public static void main(String[] args) {
		int f1=0,f2=1,i;
		System.out.println(f1+ " "+f2);
		for(i=1;i<=6;i++)
		{
			int f3=f1+f2;
			System.out.println(f3+" ");
			f1=f2;
			f2=f3;
		}
	}
}
