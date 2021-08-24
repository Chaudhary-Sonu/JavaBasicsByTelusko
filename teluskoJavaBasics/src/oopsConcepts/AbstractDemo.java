package oopsConcepts;

/*
 * 	• You can not create an object of the abstract class, rather you can extend to it.
	• You can extend an abstract class into your class and then can create object of your class, you can use reference 
		of the abstract class, but the object needs to be of your class - > which extended it.
	• If a class has any method as abstract then the class should also be abstract.
	• If you want to just declare a method instead of defining it make it an abstract type.
	• Class that extends the abstract class is known as "concrete class".
	• We need abstract class because we don’t want anyone to create object of it.

 */

abstract class Alpha1{

	abstract void display();
	
	public void show() {
		
	}
}

class Beta extends Alpha1{

	@Override
	void display() {
		//If you extend an abstract class then it is mandatory to implement the unimplemented methods of the
		//abstract class.
		System.out.println("Hi In Beta");
	}
	
}

public class AbstractDemo {

	public static void main(String args[]) {
		
		Alpha1 alpha = new Beta();
		alpha.display();
	}
}