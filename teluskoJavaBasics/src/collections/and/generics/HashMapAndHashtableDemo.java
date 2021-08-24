package collections.and.generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map store value in form of (Key, Value) pair.
 * 	1. Map is an "Interface" that extends another Interface which is nothing but "Collection".
	2. And, since Map is an Interface so in order to implement it we need a class which is "HashMap".
	3. We have one more class that implements Map that is "HashTable";
	4. The difference Is "HashMap" is not synchronized(it is not thread safe) where as "HashTable"(it is thread safe) is.
 */

public class HashMapAndHashtableDemo {
	
	public static void main(String args[]) {
		
		Map<String, String> myMap = new HashMap<>();
		
		myMap.put("Student", "Sidhu");
		myMap.put("ItPro", "Sonu");
		myMap.put("Mother", "Bebe");
		
		//If you keep key as same and add a new value to the map they the new value replaces the previous value in the map.
		
		System.out.println(myMap.get("ItPro"));
		
		System.out.println("---------------------------------");
		
		System.out.println(myMap);
		
		System.out.println("---------------------------------");
		
		//In order to print it we need something like we need indexes in List and all.
		//So, here we'll be using "KeySet"(which is nothing but basically, we create a set of Key's of a map then use it as indexes to print the MAP)
		
		Set<String> keySet = myMap.keySet();
		
		for(String s : keySet) {
			
			System.out.println("Key is : " + s + " --" + " Value is : " + myMap.get(s));
		}
	}
}