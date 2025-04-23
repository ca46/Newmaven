package helloworld2;

public class DiscountCalculator {
	
	    private int price1, price2, price3;

	
	    public DiscountCalculator(int price1, int price2, int price3) {
	        this.price1 = price1;
	        this.price2 = price2;
	        this.price3 = price3;
	    }

	   
	    public int calculateTotal() {
	        return price1 + price2 + price3;
	    }

	    
	    public double applyDiscount() {
	        int total = calculateTotal();
	        if (total > 5000) {
	            return total * 0.80; // 20% discount
	        } else {
	            return total;
	        }
	    }

	    public static void main(String[] args) {
	        // Example: item prices are 2000, 1800, 1500 => total = 5300
	        DiscountCalculator bill = new DiscountCalculator(2000, 1800, 1500);

	        System.out.println("Total Amount: " + bill.calculateTotal());
	        System.out.println("Final Amount after Discount (if any): " + bill.applyDiscount());
	    }
	}


