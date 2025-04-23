package helloworld2;


	class HDFC implements RBI {

	    // Implementation of recurringDeposit method
	    @Override
	    public double recurringDeposit(double amount, int duration) {
	        // Calculate the maturity amount using the formula for recurring deposit
	        // Assuming compound interest is calculated annually
	        double interest = amount * Math.pow(1 + INTEREST_RATE, duration) - amount;
	        return amount + interest;
	    }
	}
