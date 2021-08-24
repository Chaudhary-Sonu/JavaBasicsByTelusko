package oopsConcepts;

/*
 * Funcational Interface is interface with just one abstract method (you can have any number of default methods).
 * Before Java 8, we had to create anonymous inner class objects or implement these interfaces.
 * @FunctionalInterface --> Used to define an Interface as functional Interface, as after this you can
 * not add any method to the interface.
 */

/*
 * After java 1.8, we can define methods also in Interfaces, but they should be "default methods".
 */


interface FiDemo{
	
	void show();
}


public class FunctionalInterfaceWithLambdaExpression {
	
	public static void main(String args[]) {
		
		/*
		 * FiDemo obj = new FiDemo() { public void show() {
		 * System.out.println("In Anonymous CLASS"); } };
		 */
		
		//Lambda Expression out of Implementation of Functional Interface.
		//Lambda Expression is only achievable with Functional Interface.
		
		
		FiDemo obj = () -> System.out.println("Hi LAMBDA Expression");
		//So basically we removed the usual boiler plate code, which was given in the above lines.
		//We just need () to target the method and the -> to denote the Implementation of the method that's it.
		obj.show();
	}
}