package helloworld2;

public class BankAccount {
	
	    
	    static double balance = 0;

	    public static void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: ₹" + amount);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	    public static void withdraw(double amount) {
	        if (amount > 0) {
	            if (amount <= balance) {
	                balance -= amount;
	                System.out.println("Withdrawn: ₹" + amount);
	            } else {
	                System.out.println("Insufficient balance. Withdrawal failed.");
	            }
	        } else {
	            System.out.println("Withdrawal amount must be positive.");
	        }
	    }

	    public static void checkBalance() {
	        System.out.println("Current Balance: ₹" + balance);
	    }

	    public static void main(String[] args) {
	        deposit(1000);
	        checkBalance();

	        withdraw(500);
	        checkBalance();

	        withdraw(600);  
	    }
	}


