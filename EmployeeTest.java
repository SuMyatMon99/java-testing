package JavaTesting;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee empOne = new Employee("James Smith");
		Employee empTwo = new Employee("Mary Anne");
		
		empOne.empAge(21);
		empOne.empDesignation("Senior Software Engineer.");
		empOne.empSalary(10000);
		empOne.printEmployee();
		
		empTwo.empAge(22);
		empTwo.empDesignation("Sofrware Engineer.");
		empOne.empSalary(5000);
		empOne.printEmployee();
	}
}