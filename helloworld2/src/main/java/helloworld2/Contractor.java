package helloworld2;


	class Contractor extends Employee {
	    private double paymentPerHour;
	    private double workingHours;

	    // Constructor to initialize payment per hour and working hours
	    public Contractor(double paymentPerHour, double workingHours) {
	        this.paymentPerHour = paymentPerHour;
	        this.workingHours = workingHours;
	    }

	    // Implementation of calculateSalary for Contractor (payment per hour * working hours)
	    @Override
	    public double calculateSalary() {
	        return paymentPerHour * workingHours;
	    }
	}


