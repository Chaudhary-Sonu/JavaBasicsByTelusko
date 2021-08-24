package teluskoJavaBasics;

class A{
	
	public A() {
		System.out.println("Default Constructor of A");
	}
	
	public A(int i) {
		System.out.println("Parametrised Constructor of A");
	}
}


class B extends A{
	
	public B() {
		System.out.println("Default Constructor of B");
	}
	
	public B(int i) {
		super(5);
		System.out.println("Parametrised Constructor of B");
	}
}

//In above code whenever you create an object of 'B' it will call the default constructor of B and also the
//default constructor of A.
//And, also if while creating object if you pass Parameterised Constructor then it will call Parameterised Constructor
//of B but default of A. WHY? --> Because it has super(); method by default which calls default of A.
//But if in super(), you pass a parameter then it will call Parameterised Constructor of A.


public class SuperMethodDemo {

	public static void main(String[] args) {
		
		B obj = new B(5);
	}
}
