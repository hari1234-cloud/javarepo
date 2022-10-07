package com.arcus.javatraining.comparable1.studentcomparator;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {

	
	  public int compare(Student s1, Student s2) {
	  
	  return Integer.compare(s1.getAge(), s2.getAge()); }
	 

}
