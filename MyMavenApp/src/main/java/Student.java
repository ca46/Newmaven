public class Student {
    
    
    private int marks1, marks2, marks3;
    
    
    public Student(int marks1, int marks2, int marks3) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    
    
    public int calculateTotalMarks() {
        return marks1 + marks2 + marks3;
    }
    
    
    public String calculateGrade(int totalMarks) {
        if (totalMarks >= 270) {
            return "A";
        } else if (totalMarks >= 240) {
            return "B";
        } else if (totalMarks >= 210) {
            return "C";
        } else {
            return "D";
        }
    }
    
    public static void main(String[] args) {
        
        Student student1 = new Student(85, 90, 88);  
        Student student2 = new Student(75, 80, 70);  
        
        
        int totalMarks1 = student1.calculateTotalMarks();
        String grade1 = student1.calculateGrade(totalMarks1);
        System.out.println("Student 1 - Total Marks: " + totalMarks1 + " | Grade: " + grade1);
        
       
        int totalMarks2 = student2.calculateTotalMarks();
        String grade2 = student2.calculateGrade(totalMarks2);
        System.out.println("Student 2 - Total Marks: " + totalMarks2 + " | Grade: " + grade2);
    }
}
