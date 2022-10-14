package ArrayListConcept;

import java.util.ArrayList;

public class VirtualCapacityList {

	public static void main(String[] args) {
		
		
		ArrayList<Object> ar =new ArrayList<Object>(10);
		
		System.out.println(ar.size());   // PC=0
		ar.add(100);
		System.out.println(ar.size());   // PC=1
		
		ar.add(200);   //PC=2
		ar.add(300);	//PC=3
		ar.add(400);    //PC=4
		
		System.out.println(ar.size());
	}
}
