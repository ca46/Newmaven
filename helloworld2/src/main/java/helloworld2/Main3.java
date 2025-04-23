package helloworld2;

public class Main3 {
	public static void main(String[] args) {
        
        double price = 100.0;  
        
       
        Offseason offseason = new Offseason();
        Onseason onseason = new Onseason();
        
        
        System.out.println("Offseason Purchase:");
        offseason.discount(price);  
        
       
        System.out.println("\nOnseason Purchase:");
        onseason.discount(price);  
    }
}
