package solid.LiskovSubstitutionPrinciple;

public class TraineeEmployee extends Employee {
	private String location;
	
	public TraineeEmployee(int id, String name, String location) {
		super(id, name);
		this.location = location;
	}
	
	public void printMe() {
		super.printMe();
		System.out.println(" Emp Location:- "+ this.location );
	}
}
