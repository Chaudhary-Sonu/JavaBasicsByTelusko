package teluskoJavaBasics;

/*
 *We can basically create an Inner class with in a class, if we have some specific
 *Requirements.
 * Types of Inner Class :-
 * 1. Inner Class
 * 2. Static Class
 * 3. Anonymous Class
 * 
 */

class Outer{
	
	public void show() {
		System.out.println("Inside OuterClass without InnerClass");
	}
	
	//Outer$Inner.class ($ -> Denotes that the class is an Inner class)
	//You can find this name if you got to project location -> open src -> bin
	static class Inner{
		
		public void display() {
			System.out.println("Inside InnerClass");
		}
	}
}

public class InnerClassDemo {
	
	public static void main(String args[]) {
		
		Outer obj = new Outer();
		obj.show();
		
		//creating Object for inner class when it's not Static
		/*
		 * Outer.Inner obj1 = obj.new Inner(); obj1.display();
		 */
		
		//If we declare the innerClass as static then we don't need to use the object of 
		//outer class to create object of inner class. We, can do it as
		Outer.Inner obj1 = new Outer.Inner();
		obj1.display();
	}
}
