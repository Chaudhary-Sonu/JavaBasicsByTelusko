package collections.and.generics;

import java.util.ArrayList;
import java.util.List;

/*
 * Why we are using "List" instead of Collection(which we used in the last code) is because since, Collection interface does not 
 * deals with Index numbers so, we printed the elements using Iterator, but what if we want to insert any number in between the values.
 * Then we can't use Collection.
 * 
 * So, in that case we can use List which has this functionality to deal with indexes.
 */

public class ListInterfaceWithArrayListDemo {

	public static void main(String[] args) {
		
		List values = new ArrayList();
		//List support all types of values but here since we haven't mentioned any generics in this case it is supporting element type as Objects.
		
		values.add(2);// Here it's an Object of Integer -->> Integer v = new Integer(2);
		values.add(7);
		values.add(9);
		
		//Inserting an element at index 2
		values.add(2, 4);
		
		//To print the output we can Iterator, but we can also use enhance for or normal for loop.
		for(Object k : values) {
			System.out.println(k);
		}

	}

}