package oopsConcepts;

//It is a type or runtime Polymorphism.

class X{
	
	public void show() {
		System.out.println("In X");
	}
}

class Y extends X{
	
	@Override  //@Override this overrides the child method over parent method. It will give a 
			   //compile time error instead of a logical error.
	public void show() {
		//super.show();
		System.out.println("In Y");
	}
}

public class MethodOverridingDemo {
	
	public static void main(String args[]) {
		
		Y obj = new Y();
		obj.show();
	}
}
