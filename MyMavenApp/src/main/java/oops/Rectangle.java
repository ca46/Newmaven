package oops;

public class Rectangle extends Shape {
    double length, width;

    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public void findArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}
