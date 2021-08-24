package collections.and.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionInterfaceWithArrayListDemo {

	public static void main(String[] args) {
		
		//Here Collection is an Interface and ArrayList a class that implements it.
		Collection values = new ArrayList();
		
		//adding values to the ArrayList
		values.add(4); //this is basically not an integer it's an Object of Integer -->> Integer v = new Integer(4);
		values.add(6);
		values.add(9);
		
		//Printing the values:-
		//Step : 1-
		System.out.println(values);
		
		//It will print all the values in the collection but what if, if you want to print them one by one or any specific value. In that case 
			//we can use the concept of Iterator. Which again is an Interface and come hand when you need to get values out of a collection.	
		
		Iterator it = values.iterator();
		
		/*
		 * System.out.println(it.next()); 
		 * System.out.println(it.next());
		 * System.out.println(it.next());
		 */
		//System.out.println(it.next());
		//Here one by one we'll get all the values but problem arises when you don't know about how many values are there in the collection and,
			//how many print commands you need to use. So, here in our case we have three values and if we add one more print statement by mistake then,
			//it will throw an exception "Exception in thread "main" java.util.NoSuchElementException".
		
		//So, we have one more functionality that can help us with the problem mentioned above. And, that is
		
		//"hasNext()" checks whether the collection has next value or not and returns boolean based on that.
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}