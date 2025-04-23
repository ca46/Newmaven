package helloworld2;

	import java.util.Scanner;

	public class AreaCalculator {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Choose a figure to calculate area:");
	        System.out.println("a) Circle");
	        System.out.println("b) Rectangle");
	        System.out.println("c) Square");
	        System.out.print("Enter your option (a/b/c): ");
	        char choice = scanner.next().charAt(0);

	        switch (choice) {
	            case 'a':
	                System.out.print("Enter radius of the circle: ");
	                double radius = scanner.nextDouble();
	                double circleArea = Math.PI * radius * radius;
	                System.out.println("Area of Circle = " + circleArea);
	                break;

	            case 'b':
	                System.out.print("Enter length of the rectangle: ");
	                double length = scanner.nextDouble();
	                System.out.print("Enter breadth of the rectangle: ");
	                double breadth = scanner.nextDouble();
	                double rectangleArea = length * breadth;
	                System.out.println("Area of Rectangle = " + rectangleArea);
	                break;

	            case 'c':
	                System.out.print("Enter side of the square: ");
	                double side = scanner.nextDouble();
	                double squareArea = side * side;
	                System.out.println("Area of Square = " + squareArea);
	                break;

	            default:
	                System.out.println("Invalid option! Please choose a, b, or c.");
	        }

	        scanner.close();
	    }
	}


