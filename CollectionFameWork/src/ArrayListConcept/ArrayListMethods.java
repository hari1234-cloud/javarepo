package ArrayListConcept;

import java.util.*;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> ar1 = new ArrayList<String>();
		
		ar1.add("Java");
		ar1.add("Python");
		ar1.add("Ruby");
		ar1.add("JavaScript");
		
		
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		ar2.add("Testing");
		ar2.add("SQL");
		ar2.add("Unix");
		ar2.add("HTML");
		System.out.println("====================");
		//System.out.println(ar1);
		
		//ar1.addAll(2,ar2);  //It will add from multipe generics
		
		//System.out.println(ar1);
		
		//ar1.clear();  // it will clear all the element with empty
		//System.out.println(ar1);
		//ArrayList<String> cloneList=(ArrayList<String>)ar1.clone();
		//System.out.println(cloneList);  //Cloning is a just a copy from one element to another element
		
		System.out.println(ar1.contains("Python")); // it will return true or false
		System.out.println(ar1.contains("C"));
		
		System.out.println(ar1.indexOf("ruby")<0);
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Naveen","TOM","Lisa"));
		System.out.println(list1);
		
		
		
		

	}

}
