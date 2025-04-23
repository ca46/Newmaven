package helloworld2;

public class Main6 {
	
	    public static void main(String[] args) {
	        
	        HDFC hdfc = new HDFC();

	       
	        double depositAmount = 5000.0; 
	        int depositDuration = 2; 

	        
	        double maturityAmount = hdfc.recurringDeposit(depositAmount, depositDuration);

	        
	        System.out.println("Deposit Amount: Rs. " + depositAmount);
	        System.out.println("Duration: " + depositDuration + " years");
	        System.out.println("Maturity Amount after " + depositDuration + " years: Rs. " + maturityAmount);
	    }
	}

