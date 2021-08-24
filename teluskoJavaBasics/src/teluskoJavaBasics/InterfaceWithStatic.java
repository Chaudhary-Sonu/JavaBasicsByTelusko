package teluskoJavaBasics;

/*
 * If you make a method static in an Interface then it is accessible with just Interface name,
 * does not require object creation for that.
 * Same applies for Variables too.
 */

interface InterStatic {
	
	static int num = 8;
	
	void show();
	
	static void disp() {
		System.out.println("Hi Static Method in Interface");
	}
}


public class InterfaceWithStatic {
	
	public static void main(String args[]) {
		
		//Interface static method
		InterStatic.disp();
		
		System.out.println(InterStatic.num);
		
		//Below, we cannot change the variable as by default the variables of an Interface are final.
		//InterStatic.num = 7;
	}
}