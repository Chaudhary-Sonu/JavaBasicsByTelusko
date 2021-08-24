package MultiThreading.java;

/*
 * 	Suppose many threads are accessing one method at the same time and trying to perform some operation, 
    so what happens in this scenario is that many thread access the method at once and the operation is 
    not performed property. Ex:- Count example is good for this situation.
	
 *	So, in such a situation what you can do is you can make the method that the threads are trying 
	to access as "synchronized". So, what it does is it does not allow other threads to access 
	the method if one thread is already using it. Once, it is done it will allot it to the second thread.
	
 *	Such code is also known as Thread-Safe code. Where synchronization is implemented.  
 */


class Sync{
	
	int count = 0;
	
	public synchronized void increment() {
		
		count ++;
	}
}


public class SynchronizedDemo {
	
	public static void main(String args[]) throws Exception {
		
		Sync s = new Sync();
		
		Thread t1 = new Thread(() -> {
							
							for(int i=0; i<1000; i++) {
								s.increment();
							}
						});
		
		Thread t2 = new Thread(() -> {
			
			for(int i=0; i<1000; i++) {
				s.increment();
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("The value of count is : " + s.count);
	}

}