package MultiThreading.java;

/*
 * Since, Runnable is a functional Interface so we can use Lambda Expressions there.
 */

//We copied the code of "MultiThreadingUsingRunnableDemo.java" and we are just trying to reduce the number
//of line using the concept of Anonymous Class and Lambda Expression.

//Since, we are using these classes Hi and Hello only once in order to implement the run() method
//so, we can rather simply use them as anonymous classes and create the object of Runnable Interface with that.

/*class Hi1 implements Runnable{
	
	public void run() {
		
		for(int i=0; i<5; i++) {
			
			System.out.println("Hi");
			
			try {
				//The time "1000" is in milli-seconds. (1 second -> 1000 milli-seconds)
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			

		}
	}
}


class Hello1 implements Runnable{
	
	public void run() {
		
		for(int i=0; i<5; i++) {
			
			System.out.println("Hello");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}*/

//We have implemented the above class using Anonymous class while creating the object of Runnable.


public class MultiThreadingUsingLambdaExpressionDemo {
	
public static void main(String args[]) {
	
	/*
	 * Hi1 obj1 = new Hi1(); 
	 * Hello1 obj2 = new Hello1();
	 */
	
	//Below, we are just implementing the above classes using Anonymous class
	//Also, here we can implement the concept of Lambda Expression
	/*
	 * Runnable obj1 = () -> {
	 * 
	 * for(int i=0; i<5; i++) {
	 * 
	 * System.out.println("Hi");
	 * 
	 * try { //The time "1000" is in milli-seconds. (1 second -> 1000 milli-seconds)
	 * Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
	 * 
	 * } };
	 * 
	 * Runnable obj2 = () -> {
	 * 
	 * for(int i=0; i<5; i++) {
	 * 
	 * System.out.println("Hello");
	 * 
	 * try { Thread.sleep(1000); } catch (InterruptedException e) {
	 * e.printStackTrace(); }
	 * 
	 * } };
	 */
	
	//Since, we are just creating the objects and passing them to the thread Object. Instead, we can pass
	//the Lambda Expression directly there.
			
		Thread t1 = new Thread(() -> {
						for(int i=0; i<5; i++) {
							System.out.println("Hi");
							try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }			
						}
					});
		
		Thread t2 = new Thread(() -> {
						for(int i=0; i<5; i++) {
							System.out.println("Hello");
							try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
						}
					});
		
		t1.start();
		try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace();	}
		t2.start();
	}
}