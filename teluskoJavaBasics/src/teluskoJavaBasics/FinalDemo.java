package teluskoJavaBasics;

class Alpha{
	 final int i = 10;
	 //We can use this variable but cannot change its value, as it is declared final.
}

//Once you make a class final, no one can extend it.
//Once you make a variable final, it becomes CONSTANT.
//If you make a method as final no one can override it.

public class FinalDemo {

	public static void main(String args[]) {
		
		Alpha alpha = new Alpha();
		System.out.println(alpha.i);
	}
}