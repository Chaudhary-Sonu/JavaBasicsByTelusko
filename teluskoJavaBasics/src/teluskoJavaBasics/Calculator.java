package teluskoJavaBasics;

public class Calculator {
	
	//Instance variables
	int num1;
	int num2;
		
	//Constructor to demonstrate use of "this" keyword
	public Calculator(int num1, int num2) { //here num1 and num2 are local variables
		this.num1 = num1;
		this.num2 = num2;
		//So, to differentiate between local and instance variables we denote instance variable by this keyword.
	}

	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
}