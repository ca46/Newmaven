public class CustomerDiscount 
{

    
    public static double calculateTotalAmount(double[] prices) {
        double total = 0.0;
       
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    
    public static double checkDiscount(double totalAmount) {
        double discount = 0.0;
       
        if (totalAmount > 5000) {
            discount = totalAmount * 0.20;  
            System.out.println("You are eligible for a 20% discount.");
        } else {
            System.out.println("No discount for you.");
        }
        return discount;
    }

    
    public static void main(String[] args) {
        
        double[] itemPrices = {1200, 1500, 2500, 900};  

      
        double totalAmount = calculateTotalAmount(itemPrices);
        System.out.println("Total Amount: $" + totalAmount);

        
        double discount = checkDiscount(totalAmount);

        
        double finalAmount = totalAmount - discount;
        System.out.println("Final Amount after discount: $" + finalAmount);
    }
}
