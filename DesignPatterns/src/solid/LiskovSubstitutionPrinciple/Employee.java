package solid.LiskovSubstitutionPrinciple;

public class Employee {
	 String name;
	 int id;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void printMe() {
		System.out.println("Emp ID:- "+ this.id + " Emp Name:- "+ this.name);
	}
}
