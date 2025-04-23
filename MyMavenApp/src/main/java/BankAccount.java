public class BankAccount {
    
    private static double balance = 0.0;

    
    public static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;  
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    
    public static void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;  
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    
    public static void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        
        deposit(1500);  
        withdraw(500);  
        checkBalance(); 

        withdraw(2000); 
        deposit(300);   
        checkBalance(); 
    }
}
