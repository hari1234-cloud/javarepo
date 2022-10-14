package JavaPractice;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str="Java   Programming   for   Beginners";
		
		System.out.println("Before Removing the white spaces:"+str);
		
		str=str.replaceAll("\\s", "");
		
		System.out.println("After Removing the white spaces:"+str);
		

	}

}
