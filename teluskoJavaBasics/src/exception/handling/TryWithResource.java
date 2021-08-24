package exception.handling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResource {
	
public static void main(String args[]) throws Exception {
		
		//BufferedReader is a Java class to reads the text from an Input stream (like a file) 
		//by buffering characters that seamlessly reads characters, arrays or lines.
		int n = 0;
		
		System.out.println("Enter a Number");
		//Here were are not using catch, we are just passing the resource in the try
		//This syntax (line 17 : 21) is known as Try With Resource
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			
			n = Integer.parseInt(br.readLine());
			
		}
		//we are also not using finally to close the resource, because it close automatically but the 
		//try is executed.
			System.out.println(n);
	}
}