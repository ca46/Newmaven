package helloworld2;

public class FactorialCalculator {


	    
	    public static long calculateFactorial(int num) {
	        long factorial = 1;
	        for (int i = 1; i <= num; i++) {
	            factorial *= i;
	        }
	        return factorial;
	    }

	    
	    public static void printFactorial(int num) {
	        long result = calculateFactorial(num);  
	        System.out.println("The factorial of " + num + " is: " + result);
	    }

	    public static void main(String[] args) {
	        // Pass the number as an argument (e.g., 5)
	        int number = 5;  // Example number for factorial calculation
	        printFactorial(number);  // Call the method to print the factorial
	    }
	}


