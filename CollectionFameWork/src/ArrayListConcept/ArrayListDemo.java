package ArrayListConcept;
import java.util.*;

public class ArrayListDemo {
	public static void main(String args[]) {
		// default class
		/*
		 * int i[] = new int[4];
		 * 
		 * i[0]=100; 
		 * i[1]=400; 
		 * System.out.println(i[0]); 
		 * System.out.println(i[1]);
		 */  // Static Array 
		// Dynamic array
		//Array list is the dynamic array
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(100);  //0
		ar.add(200);  //1
		ar.add("testing");  //2
		ar.add('t');  //3
		ar.add(12.33); //4
		ar.add(true);  //5
		System.out.println(ar);
		System.out.println(ar.get(2));
		System.out.println(ar.get(1));
		System.out.println(ar.size());
		System.out.println("LI =" +0);
		System.out.println("HI =" +(ar.size()-1));
		
		ar.add(400);  //6
		ar.add(400); //7
		System.out.println(ar.size());
		
		// List with collections
		ArrayList <Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		numbers.add(500);
		numbers.add(200);
		numbers.add(600);
		ArrayList <String> Str = new ArrayList<String>(Arrays.asList("Java","Python","JS"));
		
		System.out.println(Str);
		
		
		System.out.println(Str.size());
		
		System.out.println(numbers);
		
		}
}
