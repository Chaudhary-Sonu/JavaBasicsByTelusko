package MultiThreading.java;

/*
 * We can set the priority of thread. (Priority range is 1-10 : 1 being highest priority and 10 being the lowest).
   You can also check the priority by:-
			System.out.println(t1.getPriority());
			System.out.println(t2.getPriority());
 */


public class PriorityThreadDemo {
	
	public static void main(String args[]) throws Exception {
		
		Thread t1 = new Thread(() -> {
						for(int i=0; i<5; i++) {
							System.out.println("Hi");
							
							//To get the priority of the thread, within the thread
							//when we need to perform anything inside thread we need to use "CurrentThread".
							System.out.println(Thread.currentThread().getPriority());
							
							try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }			
						}
					}, "Hi Thread");
		
		Thread t2 = new Thread(() -> {
						for(int i=0; i<5; i++) {
							System.out.println("Hello");
							try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
						}
					}, "Hello Thread");
		
		
		//Setting the priority
		//t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		
		//Starting a thread
		t1.start();
		try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace();	}			
		//Here isAlive() method will return true because t1 has started and is still running.
		t2.start();
				
		t1.join();
		t2.join();
		
		//Printing the priority
		System.out.println("The Priority of thread is : " + t1.getPriority()); 
		System.out.println("The Priority of thread is : " + t2.getPriority());
		
		//Executable statement other than threads t1 and t2.
		System.out.println("Hi Executable statement other than threads t1 and t2");
	}

}
