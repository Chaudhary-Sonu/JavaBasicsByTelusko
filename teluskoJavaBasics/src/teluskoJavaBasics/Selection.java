package teluskoJavaBasics;

public class Selection {
	
	public static void main(String args[]) {
		
		//If Else
		int n = 7;
		
		//In case if has more than one statement use {}.
		if(n == 0)
			System.out.println("Input is " + n);
		else if(n%2 == 0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
		
		
		//Ternary Operator
		int i = 8;
		int j = 0;
		
		/*
		 * if(i>6) j = 1; else j = 2; System.out.println(j);
		 */
		
		j = i>6 ? 1 : 2;
		System.out.println(j);
		
		
		//Switch Block
		int number = 4;
		
		switch(number) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Invalid Number");
		}
		
		
		//Iteration (while, do while, for, for-each)
		for(int x=4; x<6; x++) {
			System.out.println("Hello");
		}
		
		
		//Nested Loop
		/*
		* * * *
		* * * *
		* * * *
		* * * *
		*/
		for(int z=0; z<=3; z++) {
			for(int y=0; y<=3; y++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
