package collections.and.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Here, we are looking into "Collections" as a class.
 */

public class CollectionsClassDemo {
	
	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
		
		myList.add(4);
		myList.add(6);
		myList.add(8);
		myList.add(7);
				
		Collections.sort(myList);
		Collections.reverse(myList);
		Collections.shuffle(myList);

		for(Integer e : myList) {
			System.out.println(e);
		}
	}
}