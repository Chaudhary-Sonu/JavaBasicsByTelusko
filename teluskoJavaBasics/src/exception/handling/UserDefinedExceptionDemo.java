package exception.handling;

/*
 * We can create our own exception.
 */

public class UserDefinedExceptionDemo {
	
	public static void main(String args[]) {
		
		int i,j,k;
		i = 8;
		j = 9;
		
		try {
			k = i / j;
			
			//Below we are checking a condition and throwing a user defined exception with our message only.
			if(k == 0)
				throw new SonuException("This is not possible");
			//SonuException is the exception class the extends Exception. And, also has a constructor
			//that accepts a string which is our message and in order to print it, it passes it to the
			//Super class "throwable" -> where we have a method detailedMessage that prints the exception message.
			
			System.out.println(k);
			
		}catch(SonuException e) {
			
			//Printing the exception message that we passed in line : 20
			System.err.println("Error : " + e.getMessage());
			
		}
	}

}
