package helloworld2;


	interface RBI {
	    // Interest rate defined in RBI interface
	    double INTEREST_RATE = 0.07; // 7% annual interest rate

	    // Abstract method to calculate recurring deposit
	    double recurringDeposit(double amount, int duration);
	}

