package helloworld2;


	class FullTimeEmployee extends Employee {
	    private double monthlySalary;

	    // Constructor to initialize monthly salary
	    public FullTimeEmployee(double monthlySalary) {
	        this.monthlySalary = monthlySalary;
	    }

	    // Implementation of calculateSalary for FullTimeEmployee (monthly salary with 8 hours per day)
	    @Override
	    public double calculateSalary() {
	        return monthlySalary * 8;  // Multiply by 8 hours a day for Full-Time employees
	    }
	}


