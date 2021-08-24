package oopsConcepts;

//HOW TO SOLVE THE MULTIPLE INHERITANCE ISSUE (AMBIGUITY)

/*
 * Suppose you have implemented two interfaces in your class with same methods, and now you create an object
 * of your class and want to call the common method -> here the confusion, arises is now which method will 
 * be called. So, to resolve that you can use the below functionality. 
 */

interface Demo{
	
	default void show() {
		System.out.println("In Demo show");
	}
}


interface MyDemo{
	
	default void show() {
		System.out.println("In MyDemo show");
	}
}


class Imple implements Demo, MyDemo{

	@Override
	public void show() {
		Demo.super.show();
	}
	//Here when object will call show method, so it will come to this class and from here it will,
	//see that "Demo.Super.Show()" is called so it will call that.
	//OR, you can also do it this way "MyDemo.Super.Show()", in order to call show of MyDemo super interface.
	
}


public class MultipleInheritanceInInterface {
	
	public static void main(String args[]) {
		
		Imple obj = new Imple();
		obj.show();
	}
}
