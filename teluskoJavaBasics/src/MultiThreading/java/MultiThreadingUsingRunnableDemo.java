package MultiThreading.java;

/*
 *Using the Runnable Interface to create and run the threads.
 *
 *REASON :- Suppose we are in a situation where we have one more class -> "A" which is extended by
 *class "Hi", so in that case we cannot extend "Thread" class as Multiple Inheritance is not allowed in Java.
 *To get rid of this problem Runnable Interface comes into picture.
 *
 *So, now -->> "Class Hi extends A implements Runnable {}" we can use it in this format.
 */


//When a class implements "Runnable" it becomes a thread / Runnable
class Hi1 implements Runnable{
	
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
}


public class MultiThreadingUsingRunnableDemo {

	public static void main(String args[]) {
		
		Hi1 obj1 = new Hi1();
		Hello1 obj2 = new Hello1();
		
		//We had to create the object of thread class here because, Interface Runnable is a functional
		//Interface has only one method run(). But, to start a thread we need Start() -> method.
		//Which is available in Thread class. So, we are creating object of thread and passing the objects
		//of the class in it.
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		//Then we are able to start the threads.
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	}
}