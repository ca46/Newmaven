package helloworld2;

public class ShoppingDiscoun {
	

	    static double totalAmount = 0;

	    
	    public static void calculateTotal(double price1, double price2, double price3) {
	        totalAmount = price1 + price2 + price3;
	        System.out.println("Total before discount: ₹" + totalAmount);
	    }

	    
	    public static double checkDiscount() {
	        if (totalAmount > 5000) {
	            double discount = totalAmount * 0.20;
	            System.out.println("You get a discount of ₹" + discount);
	            return totalAmount - discount;
	        } else {
	            System.out.println("No discount available.");
	            return totalAmount;
	        }
	    }

	    public static void main(String[] args) {
	        
	        calculateTotal(2000, 1800, 1600);  

	       
	        double finalAmount = checkDiscount();

	        System.out.println("Final amount to be paid: ₹" + finalAmount);
	    }
	}


