package MultiThreading.java;

/*
 * 	• Join():-
		1. Suppose other than joins there is something also to be printed / executed in the main method.
		   But with the current situation("MultiThreadingUsingLambdaExpressionDemo.java") what will happen 
		   is t1 will execute and then it will wait for 10 ms to execute the second thread t2. 
		   But, what will happen in this time-stamp of 10 ms -->> is that, since the main method is 
		   also a thread only. So, what it will do is it will see that there is time gap of 10 ms so, 
		   in that let's execute the remaining things. And, hence we will not get the desired output.
		2. So, in order to get rid of this situation what we can do is we can use "join()" method. 
		   What it will do is, It will continue with the execution of t1 and t2 and once they are done 
		   will join back them with the main and then main can execute the left overs. 
	• IsAlive():-
		1. If you want to check whether your thread is alive or not you can use this method.
 */


/*
 * Naming a thread:-
 * Step:1
 * 		System.out.println(t1.getName());
		System.out.println(t2.getName());
		these will give you Thread-0 and Thread-1 as output by default, because we haven't set the name
		for the thread.
 * 
 * Step:2
 * Other way is we can pass it with the object of runnable when we are creating the thread object as
 * Shown in line : 37
 * 
 * Step:3
 * We can use setter to set the name as:-
 * 		t1.setName("Hi Thread");
		t2.setName("Hello Thread");
 */

public class JoinAndIsAliveMethodsDemo {
	
	public static void main(String args[]) throws Exception {
				
			Thread t1 = new Thread(() -> {
							for(int i=0; i<5; i++) {
								System.out.println("Hi");
								try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }			
							}
						}, "Hi Thread");
			
			Thread t2 = new Thread(() -> {
							for(int i=0; i<5; i++) {
								System.out.println("Hello");
								try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
							}
						}, "Hello Thread");
			
			//Name of the threads
			System.out.println(t1.getName());
			System.out.println(t2.getName());
		
			
			//Starting a thread
			t1.start();
			try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace();	}			
			//Here isAlive() method will return true because t1 has started and is still running.
			System.out.println(t1.isAlive());
			t2.start();
			
			//join() method
			t1.join();
			t2.join();
			
			//Here, isAlive() method will return false because t1 and t2 has ended as the thread execution
			//is completed.
			System.out.println(t1.isAlive());
			
			//Executable statement other than threads t1 and t2.
			System.out.println("Hi Executable statement other than threads t1 and t2");
		}
}