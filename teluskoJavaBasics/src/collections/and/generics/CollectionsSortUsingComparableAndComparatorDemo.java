package collections.and.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Here we are trying to sort the list<student> based on marks, for which we are using "Comparable" interface.
 * 
 * The difference between Comparator and Comparable is that using Comparator we can directly pass the object of it to the sort method, because 
 * sort has one more method where we can pass the list as well as the Comparator object.
 * 
 * But, we don't have the sort method to pass the Comparable.
 */

class Student implements Comparable<Student> {

	int rollNo;
	String name;
	int marks;

	// Parameterized Constructor to initialize the values of the student elements
	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}


	@Override public int compareTo(Student o) {
	  
		//if(marks > o.marks) { 
			//return 1; 
			//}else { 
			//return -1;
			//}
	  
		//Implementing the above statements using Ternary Operator. 
		return marks > o.marks ? 1: -1; 
		}
}


public class CollectionsSortUsingComparableAndComparatorDemo {

	public static void main(String args[]) {

		List<Student> stud = new ArrayList<>();

		stud.add(new Student(1, "Sonu", 75));
		stud.add(new Student(2, "Simar", 85));
		stud.add(new Student(3, "Shivang", 65));

		//Sorting the list using Comparable
		Collections.sort(stud);

		for (Student s : stud) {
			System.out.println(s);
		}
		
		System.out.println("-----------------------------------------");
		
		//Implementing the Comparator to sort the list based on Name length
		Collections.sort(stud, (i, j) -> i.name.length() > j.name.length() ? 1 : -1);
		
		for (Student s : stud) {
			System.out.println(s);
		}
	}
}