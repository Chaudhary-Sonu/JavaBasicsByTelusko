package oopsConcepts;

/*
 * Example of Multi-level Inheritance and Single Inheritance
 */

class CalA{ //Super Class
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
}

class CalB extends CalA{ //Sub Class
	
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
}

class CalC extends CalB{

	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		
		CalC obj = new CalC();
		System.out.println(obj.add(2, 5));
		System.out.println(obj.subtract(7, 4));
		System.out.println(obj.multiply(5, 5));
	}
}
