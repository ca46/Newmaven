package helloworld2;

public class Offseason {
	public void discount(double price) {
        double discount = 0.15 * price;  // 15% discount
        double finalPrice = price - discount;
        System.out.println("Offseason Discount: 15%");
        System.out.println("Original Price: $" + price);
        System.out.println("Discounted Price: $" + finalPrice);
    }
}
