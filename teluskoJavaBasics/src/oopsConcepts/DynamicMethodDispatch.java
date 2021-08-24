package oopsConcepts;

class A1{ //Super
	
	public void show() {
		System.out.println("In Class A");
	}
}

class B1 extends A1{ //Sub
	
	public void show() {
		System.out.println("In Class B");
	}
}

class C1 extends A1{ //Sub
	
	public void show() {
		System.out.println("In Class C");
	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		
		A1 obj = new B1(); //Runtime Polymorphism
		//Using reference of A and creating object of B.
		obj.show();
		
		//If using reference of A and creating object of C, it will return show() of C, 
		//and is known as Dynamic Method Dispatch
		obj = new C1(); //Dynamic Method Dispatch
		obj.show();
	}
}