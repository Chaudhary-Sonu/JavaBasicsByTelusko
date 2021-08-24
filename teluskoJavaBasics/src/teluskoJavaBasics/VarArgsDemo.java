package teluskoJavaBasics;

class Calc{
	
	public int add(int ... i) {
		int sum = 0;
		for(int k : i) {
			sum = sum + k;
		}
		return sum;
	}
}

public class VarArgsDemo {
	
	public static void main(String args[]) {
		
		Calc obj = new Calc();
		
		System.out.println(obj.add(1, 5, 6, 7, 8, 22, 55, 34, 4));
	}
}
