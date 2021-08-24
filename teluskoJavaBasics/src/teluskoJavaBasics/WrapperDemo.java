package teluskoJavaBasics;

/*
 * 	• Integer for int is a wrapper class.
	• Mostly for all primitive data types we have wrapper class.
	• Int i=4;
	• Integer k = new Integer(i); //Putting a primitive variable inside an Object is known as Wrapping / Boxing.
	• Int l = k.intValue(); //Unboxing / Unwrapping. 

 */

public class WrapperDemo {

	public static void main(String args[]) {
		
		int i = 4;
		Integer value = i; //Auto-Boxing (Assigning of a primitive data variable to the Object of wrapper class)
		
		int k = value; //Auto-Unboxing (getting the value from the Object of wrapper class in to an int)
		
		String a = "123";
		int z = Integer.parseInt(a);
		System.out.println(z);
	}
}
