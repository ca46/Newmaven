package helloworld2;

public class Main5 {
	public static void main(String[] args) {
        
        Contractor contractor = new Contractor(50.0, 120);  
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(3000);  // Monthly salary

        
        System.out.println("Contractor Salary: $" + contractor.calculateSalary());
        System.out.println("Full-Time Employee Salary: $" + fullTimeEmployee.calculateSalary());
    }
}
