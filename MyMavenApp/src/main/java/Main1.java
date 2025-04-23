public class Main1 {

   
    public static void calculateArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    
    public static void calculateArea(double length, double width) {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}