package JavaPractice;

public class ReverseString {

	public static void main(String[] args) {

	String str="Fragual Testing";
		String rev="";
		
		//3) Using String Buffer class
				StringBuffer sb=new StringBuffer(str);
				System.out.println(sb.reverse());
				
		// 1) Using +String(Concatenation) Operator
		/*int len=str.length();  //4
		
		str.charAt(0);
		
		for(int i=len-1;i>=0;i--)  //3 2
		{
			rev=rev+str.charAt(i); //D C B A
			
		}
		System.out.println("Reverse String is:" +rev);*/
		
		
	// 2) Character Array
		/*char a[] = str.toCharArray();	
		int len=a.length; //4
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println(rev);*/
		}
}
