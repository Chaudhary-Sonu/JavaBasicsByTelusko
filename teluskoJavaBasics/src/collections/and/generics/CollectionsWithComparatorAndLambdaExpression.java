package collections.and.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * We are using comparator to enhance our sorting mechanism. We are going to sort some Integer based on their last digits. 
 */

public class CollectionsWithComparatorAndLambdaExpression {
	
	public static void main(String args[]) {
		
		List<Integer> myList = new ArrayList<>();
		
		myList.add(404);
		myList.add(678);
		myList.add(569);
		myList.add(875);
		
		
		//Using the comparator as you can see we are checking for the last digits and based on that we are sending the response as
		//either 1 or -1 to the method sort as a parameter which simply means that need to sort or need not to sort.
		
		//Since, Comparator is a functionalInterface so we can use lambda expressions here and remove the unwanted code.
		/*
		 * Comparator<Integer> c = new Comparator<>() {
		 *		 public int compare(Integer i, Integer j) { 
		 * 			if(i%10 > j%10) { 
		 * 				return 1; 
		 * 			}else { 
		 * 				return -1; 
		 * 				  } 
		 * 			}
		 * 		 };
		 * 
		 * The code above is converted to lambda expression below
		 */
		
		//After converting it to lambda expression.
		//Comparator<Integer> c = (i, j) -> {	if(i%10 > j%10) { return 1;	}else {	return -1; } };		
		//Since here we're just assigning it to c. So, Instead of that we can directly pass the "lambda expression" to the sort as a parameter.
		
		
		Collections.sort(myList, (i, j) -> {	if(i%10 > j%10) { return 1;	}else {	return -1; } });
		
		for(Integer n : myList) {
			System.out.println(n);
		}
	}
}