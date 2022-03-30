package solid.LiskovSubstitutionPrinciple;

public class Driver {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "abc");
		useMeToPrintData(e1);
		TraineeEmployee e2 = new TraineeEmployee(2,"xyz", "Online");
		useMeToPrintData(e2);
	}
	
	public static void useMeToPrintData(Employee e){
		e.printMe();
	}
}
