package teluskoJavaBasics;

public class Operators {
	
	public static void main(String args[]) {
		int m = 6;
		int n = 3;
		
		int r1 = m / n;
		System.out.println(r1);
		
		double r2 = m / n;
		System.out.println(r2);
		
		double r3 = (double)m / n; //Type casting
		System.out.println(r3);
		
		n += m; //n = n + m; (Short Hand Operator)
		System.out.println(n);
		//++n -> Pre Increment
		//n++ -> Post Increment
	}
}