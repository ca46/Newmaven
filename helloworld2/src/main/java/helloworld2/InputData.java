package helloworld2;

	import java.util.Scanner;

	public class InputData {
	    double basicPay, deduction, bonus;

	    public void getInput() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Basic Pay: ");
	        basicPay = sc.nextDouble();

	        System.out.print("Enter Deduction: ");
	        deduction = sc.nextDouble();

	        System.out.print("Enter Bonus: ");
	        bonus = sc.nextDouble();

	        // sc.close(); // Don't close if Scanner is used elsewhere
	    }
	}


