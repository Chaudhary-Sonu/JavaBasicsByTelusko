package teluskoJavaBasics;

/*
 * After java 1.8 you can define methods in Interface.
 */

interface FiWithDefinedMethods{
	
	void doSomething();
	
	default void show() {
		System.out.println("In SHOW of Interface");
	}
}

class Impl implements FiWithDefinedMethods{

	@Override
	public void doSomething() {
		
		System.out.println("Inside Implemented Method in IMPL");
	}
	
	public void show() {
		System.out.println("In SHOW of IMPL Class");
	}
	
}

public class InterfaceWithDefaultMethods {
	
	public static void main(String args[]) {
		
		Impl obj = new Impl();
		
		obj.doSomething();
		obj.show();
	}
}