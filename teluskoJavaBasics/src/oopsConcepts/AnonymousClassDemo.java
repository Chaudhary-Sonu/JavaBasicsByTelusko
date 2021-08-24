package oopsConcepts;

/*
 * 	• Suppose you want to override a method of parent / super class -- > You can achieve this by extending the super class in to sub class and overriding the method.
	• But, what if you want that and just want to override it for once.
	• Then comes the concept of Anonymous Class.
 */


class Abc{
	
	public void show() {
		System.out.println("In Class ABC");
	}
}


//if your idea is not to use the particular defination in the class, you can create anonymous class.
//Not Only that you can use Anonymous Class to implement the Interfaces also. Basically, you can create Object of 
//Interface using anonymous class.
public class AnonymousClassDemo {
	
	public static void main(String args[]) {
		
		Abc obj = new Abc() {   //ANONYMOUS Class
			
								public void show() {
									System.out.println("In Anonymous CLASS");
								}
							};
		obj.show();
		
		/*
		 *          {
							public void show() {
								System.out.println("In Class ABC");
								}
					};
			This is known as Anonymous Class
			While creating object you can use {} and inside them you can override the method or do whatever you want.
		 */
	}
}
