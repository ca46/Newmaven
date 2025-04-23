public class Shape {

  
    private double radius;      
    private double length;      
    private double width;       
    private int side;           

   
    public Shape(double radius) {
        this.radius = radius;
    }

    
    public Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    public Shape(int side) {
        this.side = side;
    }

    
    public void calculateArea() {
        if (radius != 0) {
            double area = Math.PI * radius * radius;
            System.out.println("Area of Circle: " + area);
        }
    }

   
    public void calculateAreaRectangle() {
        if (length != 0 && width != 0) {
            double area = length * width;
            System.out.println("Area of Rectangle: " + area);
        }
    }

    
    public void calculateAreaSquare() {
        if (side != 0) {
            double area = side * side;
            System.out.println("Area of Square: " + area);
        }
    }

   
    public void calculateTotalAmount() {
        double totalAmount = 0;

        
        if (radius != 0) {
            totalAmount += Math.PI * radius * radius;  
        }
        if (length != 0 && width != 0) {
            totalAmount += length * width;  
        }
        if (side != 0) {
            totalAmount += side * side;  
        }

        System.out.println("Total Amount (Sum of all areas): " + totalAmount);
    }

    public static void main(String[] args) {
        
        Shape circle = new Shape(7.5);          
        Shape rectangle = new Shape(5, 10);      
        Shape square = new Shape(4);             

        
        circle.calculateArea();
        rectangle.calculateAreaRectangle();
        square.calculateAreaSquare();

        
        circle.calculateTotalAmount();
    }
}

