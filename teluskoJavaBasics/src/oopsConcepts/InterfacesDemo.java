package oopsConcepts;

/*
 * 	• Interface is mostly like abstract class but it only has public abstract methods, unlike abstract class which have abstract methods as well as defined methods.
	• No need to mention methods as public abstract in Interface, as by default they already are.  
	• Difference between abstract class and Interface :-
		Interface only has public abstract methods, unlike abstract class which have abstract methods as well as defined methods.
		You can implements as many interfaces as you want in to your class but in case of abstract class you can only extend one.
	• We cannot create object of Interface. Only, reference Is allowed.
	• We don't have constructors in Interface.
 */

/*
 * Types of Interfaces :-
 * 1. Normal Interface.
 * 2. Single Abstract Method Interface (Functional Interface). 
 * 3. Marker interface. (No methods)
 */

interface Writer{
	
	void write();
}


class Pen implements Writer{

	@Override
	public void write() {
		System.out.println("I am a PEN");
	}	
}


class Pencil implements Writer{

	@Override
	public void write() {
		System.out.println("I am a PENCIL");
	}
}


//What we have done here is -->> instead of passing idividual object in the method doSomething as parameter
//we are passing the Super writer. Now we just need to create an Object of the class that Implements the writer
//and pass on that object in calling Kit class. So, based on the object passed it will call the respective class
//method and show the output.
class Kit{
	
	public void doSomething(Writer w) {
		w.write();
	}
}


public class InterfacesDemo {
	
	public static void main(String args[]) {
		
		Kit kit = new Kit();
		Writer p = new Pen();
		Writer pc = new Pencil();
		//We cannot create object of interface, but we can create reference of it and object of the class
		//that implements interface.
		kit.doSomething(p);
		kit.doSomething(pc);
	}
}