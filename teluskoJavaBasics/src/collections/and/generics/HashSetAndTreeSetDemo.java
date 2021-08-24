package collections.and.generics;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set is mostly similar to List but it does not accepts duplicate values.
 * Two types of Set are HashSet and TreeSet.
 * 		HashSet prints elements in random order.
 * 		TreeSet prints elements in ascending order.
 */

public class HashSetAndTreeSetDemo {
	
	public static void main(String args[]) {
		
		//Using the HashSet
		Set<Integer> mySet = new HashSet<>();
		
		mySet.add(53);
		mySet.add(67);
		mySet.add(89);
		
		for(Integer i : mySet) {
			
			System.out.println(i);
		}
		
		
		System.out.println("----------------------");
		
		
		//Using the TreeSet
				Set<Integer> mySet1 = new TreeSet<>();
				
				mySet1.add(53);
				mySet1.add(67);
				mySet1.add(89);
				
				for(Integer i : mySet1) {
					
					System.out.println(i);
				}
	}
}