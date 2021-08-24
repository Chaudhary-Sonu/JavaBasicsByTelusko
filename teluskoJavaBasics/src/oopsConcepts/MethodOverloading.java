package oopsConcepts;

//Writing method with same name and different parameters is known as method overloading
//Sane way you can perform constructor overloading

class add{
	
	public void addition(int i, int j) {
		System.out.println(i + j);
	}
	public void addition(int i, int j, int k) {
		System.out.println(i + j + k);
	}
	public void addition(double i, double j) {
		System.out.println(i + j);
	}
}


public class MethodOverloading {
	
	public static void main(String args[]) {
		
		add calc = new add();
		
		calc.addition(4, 5);
		calc.addition(2, 3, 4);
		calc.addition(5.5, 7.5);
	}
}
