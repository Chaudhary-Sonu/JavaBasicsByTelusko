package teluskoJavaBasics;

import java.util.Scanner;

/*
 * Scanner is a class that is used to get Input.
 */

public class ScannerDemo {
	
	public static void main(String args[]) {
		
		System.out.println("Enter a Number");
		
		//Creating an Object of scanner class and calling nextInt method to get the integer value.
		//System.in shows it accepts input from the system.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(n);
	}
}
