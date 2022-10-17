package ArrayListConcept;

import java.util.*;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		
		ArrayList<String> student = new ArrayList<String>();
		
		student.add("Hari");   //0
		student.add("Tom");   //1
		student.add("Anil");   //2
		student.add("Yashu");   //3
		student.add("Manu");   //4
		
		
		student.add("Name of the particular student");
		
		
		// Approach 1 --> typical for loop
		
		for(int i=0;i<student.size();i++)
		{
			System.out.println(student.get(i));
		}
		System.out.println("=============================");
		// Approach 2  -->  for each loop we can iterate
		for(String s:student)
		{
			System.out.println(s);
		}
		System.out.println("============================");
		//Approach 3 ---> Lambda with stream expression
		student.stream().forEach(ele->System.out.println(ele));
		
		System.out.println("============================");
		
		//Approach 4 ---->  Iterator
		
		Iterator<String>it = student.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
