package teluskoJavaBasics;

public class JumpStatements {
	
	public static void main(String args[]) {
		
		//break, continue
		
		//Continue is used if in case of a loop you want to skip any iteration, then use continue
		for(int i=0; i<=4; i++) {
			
			if(i == 3) {
				continue;
			}
			
			System.out.println("Hi, the value of i is " + i);
		}
		
		//Break is used if in case of a loop, if you want to end the loop at an specific point, then use break
		for(int i=0; i<=4; i++) {
					
			if(i == 3) {
				break;
			}
				
			System.out.println("Hi, the value of i is " + i);
		}
	}
}
