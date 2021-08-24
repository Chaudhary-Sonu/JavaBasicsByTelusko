package collections.and.generics;

import java.util.ArrayList;
import java.util.List;

/*
 * Now, why we need Generics is -> As seen in the last example the list is accepting indexes to work with values but the types of 
 * data is not set. Basically, it's accepting the element type as Object and as an object we can pass -> integer, string or any other form.
 * 
 * So, in order to fix that we will use Generics.
 */

public class ListInterfaceWithArrayListWithGenericsDemo {

	public static void main(String[] args) {
	
		List<Integer> myList = new ArrayList<>();
		
		myList.add(4);
		myList.add(6);
		myList.add(8);
		myList.add(7);
		
		//Here, when you try to add an element of type String it showed error.
		//myList.add("String");
		
		for(Integer e : myList) {
			System.out.println(e);
		}
	}
}