package teluskoJavaBasics;

//Array Of Objects
class Student{
	
	int rollNo;
	String name;
	
	public Student() {
		rollNo = 1;
		name = "Bots";
	}
}

public class ArrayDemo {
	
	public static void main(String args[]) {
		
		int num[] = new int[4];
		//Array can also be defined while creating.
		//int num[] = {4, 42, 43, 44};
		num[0] = 4;
		num[1] = 42;
		num[2] = 43;
		num[3] = 44;
		for(int i=0; i<4; i++) {
			System.out.println(num[i] + "\n");
		}
		
		
		//Array of Object
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		//Creating array of Object 
		//Student s[] = {s1, s2, s3, s4};
		Student s[] = new Student[4];
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		s[3] = s4;
		System.out.println(s[0].rollNo + " : " + s[0].name);
		//to print the complete array of Object
		for(int j=0; j<4; j++) { 
			System.out.println(s[j].name + " : " + s[j].rollNo);
		}
		
		
		//Creating a 2D array or Jagged Array
		int d[][] = {
				{1, 2, 3},
				{4, 5},
				{2, 3, 4, 5}
		};
		
		for(int i=0; i<d.length; i++) {
			for(int j=0; j<d[i].length; j++) {
				System.out.print(" " + d[i][j]);
			}
			System.out.println();
		}
		
		
		//Enhanced for loop
		//For 1D array
		int z[] = {1,4,7,0};
		
		for(int k : z) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		//For 2D array or Jagged Array
		int y[][] = {
				{1, 2, 3},
				{4, 5},
				{2, 3, 4, 5}
		};
		
		for(int l[] : y) {
			for(int x : l) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}
}