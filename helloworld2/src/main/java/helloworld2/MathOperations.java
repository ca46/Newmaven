package helloworld2;

public class MathOperations {
	

	    
	    public static int average(int a, int b, int c) {
	        return (a + b + c) / 3;
	    }

	    public static float average(float a, float b, float c) {
	        return (a + b + c) / 3;
	    }

	    
	    public static double area(double radius) { 
	        return Math.PI * radius * radius;
	    }

	    public static int area(int length, int breadth) { 
	        return length * breadth;
	    }

	    public static int area(int side) {  
	        return side * side;
	    }

	    public static void main(String[] args) {

	       
	        System.out.println("Average of integers: " + average(10, 20, 30));
	        System.out.println("Average of floats: " + average(10.5f, 20.7f, 30.2f));

	        
	        System.out.println("Area of circle (r = 5): " + area(5.0));
	        System.out.println("Area of rectangle (l = 4, b = 6): " + area(4, 6));
	        System.out.println("Area of square (side = 4): " + area(4));  // Calls area(int)
	    }
	}


