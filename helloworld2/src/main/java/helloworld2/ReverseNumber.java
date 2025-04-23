package helloworld2;

public class ReverseNumber {

	    int num;  
	    int reverse = 0;

	    
	    public ReverseNumber() {
	        System.out.println("Finding reverse...");
	    }

	   
	    public ReverseNumber(int num) {
	        this.num = num;  // Argument and instance variable are the same
	        while (num != 0) {
	            int digit = num % 10;
	            reverse = reverse * 10 + digit;
	            num /= 10;
	        }
	        System.out.println("Reverse of the number is: " + reverse);
	    }

	    public static void main(String[] args) {
	        // Only one constructor should be called from main
	        ReverseNumber obj = new ReverseNumber(5678); // Try changing the number
	    }
	}


