import java.util.Scanner;

public class AreaCalculator {

    
    public static void calculateCircleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    
    public static void calculateRectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    
    public static void calculateSquareArea(double side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Select the figure to calculate area:");
        System.out.println("a) Circle");
        System.out.println("b) Rectangle");
        System.out.println("c) Square");
        System.out.print("Enter your choice (a/b/c): ");
        char choice = scanner.next().charAt(0);

        
        switch (choice) {
            case 'a':
                
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                calculateCircleArea(radius);
                break;
            case 'b':
                
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the breadth of the rectangle: ");
                double breadth = scanner.nextDouble();
                calculateRectangleArea(length, breadth);
                break;
            case 'c':
                
                System.out.print("Enter the side of the square: ");
                double side = scanner.nextDouble();
                calculateSquareArea(side);
                break;
            default:
                System.out.println("Invalid choice! Please select a valid option (a/b/c).");
        }

        
    }
}
