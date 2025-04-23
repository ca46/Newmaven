package Package3;

import oops.Circle;
import oops.Rectangle;
import oops.Shape;

public class Mains {
    public static void main(String[] args) {
        
        Shape shape1 = new Circle(7); 
        shape1.findArea(); 

        
        Shape shape2 = new Rectangle(5, 8); 
        shape2.findArea(); 
    }
}
