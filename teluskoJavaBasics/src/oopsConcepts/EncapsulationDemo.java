 package oopsConcepts;
 
/*
 * The concepts of encapsulation helps us to Bind data with the methods.
 * Getters and Setters is one Example of Encapsulation.
 * Also logging is easy and we can place logs in methods(getters and setters).
 * Anyone can't access the variables as they are private. 
 */
 
class Employee{
	
	private int empId;
	private String empName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
}

public class EncapsulationDemo {
	
	public static void main(String args[]) {
		
		Employee obj = new Employee();
		obj.setEmpId(1);
		obj.setEmpName("Sonu");
		
		System.out.println("The Name of the Employee is " + obj.getEmpName());
		System.out.println("The ID of the Employee is " + obj.getEmpId());
	}
}