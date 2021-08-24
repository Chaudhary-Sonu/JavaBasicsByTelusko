package teluskoJavaBasics;

public class CalculatorController {
	
	public static void main(String args[]) {
		
		//Calculator calc = new Calculator(); //Calculator() is the Constructor.
		
		//Example of "This" keyword
		
		Calculator calc = new Calculator(4, 5);
		System.out.println(calc.num1 + " " + calc.num2);
		
		System.out.println("The result for addition of two numbers is " + calc.add(2, 2));
		System.out.println("The result for addition of two numbers is " + calc.subtract(2, 2));
		System.out.println("The result for addition of two numbers is " + calc.multiply(2, 2));
		System.out.println("The result for addition of two numbers is " + calc.divide(2, 2));
	}
}
