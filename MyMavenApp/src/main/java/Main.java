public class Main {
	

    
    public static void calculateAverage(int num1, int num2, int num3) {
        double average = (num1 + num2 + num3) / 3.0; 
        System.out.println("Average of integers: " + average);
    }

    
    public static void calculateAverage(float num1, float num2, float num3) {
        double average = (num1 + num2 + num3) / 3.0;  
        System.out.println("Average of floats: " + average);
    }

    public static void main(String[] args) {
        
        calculateAverage(10, 20, 30);
        calculateAverage(10.5f, 20.5f, 30.5f);
    }
}
