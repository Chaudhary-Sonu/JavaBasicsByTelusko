package teluskoJavaBasics;

//Here we have use static with the variable ceo, because of which whenever that variable will be assigned to
//a new value it will be available all through out the other objects too. 

class Emp{
	
	int id;
	int salary;
	static String ceo; 
	
	//Also to initialize static variables we can use static block
	static{
		ceo = "Rakesh";
		System.out.println("IN Static");
	}
	//Will be executed when class is loaded
	
	//Constructor to initialize all non static variables
	//Loaded when object is created
	public Emp() { 
		id = 1;
		salary = 90000;
		System.out.println("IN Constructor");
	}
	
	public void showOutput() {
		System.out.println(id + " : " + salary + " : " + ceo);
	}
}

public class StaticDemo {

	public static void main(String args[]) {
		
		Emp sonu = new Emp();
		/*
		 * sonu.id = 2; sonu.salary = 80000;
		 */
		
		//sonu.ceo = "Rakesh";
		//we can either use the object name for ceo variable or we can access it by using class name also.
		//Class name is preferable.
		Emp.ceo = "Rakesh";
		sonu.showOutput();
		
		Emp simar = new Emp();
		/*
		 * simar.id = 3; simar.salary = 60000; Emp.ceo = "Rakesh";
		 * 
		 * Emp.ceo = "Nitin";
		 */
		sonu.showOutput();
		simar.showOutput();
		
	}
}
