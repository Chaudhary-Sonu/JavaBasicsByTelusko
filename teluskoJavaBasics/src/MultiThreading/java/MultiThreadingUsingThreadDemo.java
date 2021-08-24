package MultiThreading.java;

/*
 * 	• Method "main" is a thread in itself.
	• When your class extends Thread it become a thread itself.
	• Uses of Multi threading:-
		1. Using all the cores of the CPU parallel to improve performance or decrease response timing.
		2. Performing Asynchronous tasks.
		3. Access web applications.
		4. In Games ex:- CS:GO.
	• Creating a thread:-
		Extending the "Thread" class.
 */


//When a class extends Thread it becomes a thread
class Hi extends Thread{
	
	//when you create an object of this class and call the thread, the thread call the run() method
	public void run() {
		
		for(int i=0; i<5; i++) {
			
			System.out.println("Hi");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			

		}
	}
}


class Hello extends Thread{
	
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

public class MultiThreadingUsingThreadDemo {

	public static void main(String args[]) {
		
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		
		//Calling thread one
		obj1.start();
		
		//When you will run this class the output will look something like this
		/*
 		 *  Hi
			Hello
			Hi
			Hello
			Hi
			Hello
			Hi
			Hello
			Hello
			Hi
			
			Here, clearly you can see that in the end the thread got confused whether to print hi first 
			or hello, so it randomly chooses one and executes. And, because of that our sequence breaks.
			
			To avoid such a scenario we can add a sleep time for thread in between the calling of both the 
			threads, which is clearly visible in below lines. This will execute obj1 first pause for 10 
			milliseconds and then execute obj2.
		 */
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Calling second thread
		obj2.start();
	}
}
