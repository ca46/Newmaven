package helloworld2;

public class Onseason {
	public void discount(double price) {
        double discount = 0.40 * price;  // 40% discount
        double finalPrice = price - discount;
        System.out.println("Onseason Discount: 40%");
        System.out.println("Original Price: $" + price);
        System.out.println("Discounted Price: $" + finalPrice);
    }
}
