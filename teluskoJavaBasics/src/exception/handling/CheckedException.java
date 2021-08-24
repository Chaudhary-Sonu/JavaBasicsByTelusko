package exception.handling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Exception that arise at compile-time (like if a compiler knows about the Exception)
 * 	• Use "throws"  to handle such exception or you can go with try-catch too.
 */

public class CheckedException {
	
	public static void main(String args[]) throws Exception {
		
		//BufferedReader is a Java class to reads the text from an Input stream (like a file) 
		//by buffering characters that seamlessly reads characters, arrays or lines.
		BufferedReader br = null;
		int n = 0;
		
		System.out.println("Enter a Number");
		try {
		
			br = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine());
			
		}catch(Exception e) {
			
			System.out.println(e);
		
		}
		
		finally {
			br.close();
			
			System.out.println(n);
		}
	}
}
