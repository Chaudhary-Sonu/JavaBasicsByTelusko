package exception.handling;

/*Unchecked Exception (occurs at run-time)
 * 
• Try - Catch
	You can surround the statement that is liable to throw exception in try block and catch the Exception in Catch block
• Finally
	Whatever you put in finally block will be executed at any cost if the code throws exception or not.
*/


public class TryCatchFinally {

	public static void main(String arga[]) {
		
		try {
			
			int a[] = new int[5];
			a[5] = 4;
			
			int i = 9 / 0;
		
		}catch(ArithmeticException e) {
		
			System.err.println("Cannot Divide by Zero");
		
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Array out of limit");
		
		}catch(Exception e) {
			
			System.out.println("Exception");
			
		}
		//You can use multiple catch blocks, but make sure the (Exception e) should be at end because it can
		//handle every exception.
		
		finally {
			System.out.println("Hi, Inside Finally");
		}
	}
}
