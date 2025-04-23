package helloworld2;

public class Main4 {
	public static void main(String[] args) {
        
        Bank bank = new Bank();
        User user = new User();
        
        
        int enteredPin = user.getPinFromUser();
        
        
        bank.setPin(enteredPin);
        
       
        if (bank.validatePin()) {
            System.out.println("PIN validated successfully. You can withdraw the amount.");
        } else {
            System.out.println("Invalid PIN. Please try again.");
        }
    }
}

