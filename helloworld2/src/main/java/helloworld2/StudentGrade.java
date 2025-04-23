package helloworld2;

public class StudentGrade {
	
	    private int mark1, mark2, mark3;

	   
	    public StudentGrade(int m1, int m2, int m3) {
	        this.mark1 = m1;
	        this.mark2 = m2;
	        this.mark3 = m3;
	    }

	    
	    public int getTotalMarks() {
	        return mark1 + mark2 + mark3;
	    }

	    
	    public String calculateGrade() {
	        int total = getTotalMarks();
	        double average = total / 3.0;

	        if (average >= 90) {
	            return "A+";
	        } else if (average >= 75) {
	            return "A";
	        } else if (average >= 60) {
	            return "B";
	        } else if (average >= 50) {
	            return "C";
	        } else {
	            return "Fail";
	        }
	    }

	    public static void main(String[] args) {
	        // Student 1: marks = 85, 90, 80
	        StudentGrade student1 = new StudentGrade(85, 90, 80);
	        System.out.println("Student 1 Total: " + student1.getTotalMarks());
	        System.out.println("Student 1 Grade: " + student1.calculateGrade());

	        // Student 2: marks = 60, 58, 65
	        StudentGrade student2 = new StudentGrade(60, 58, 65);
	        System.out.println("Student 2 Total: " + student2.getTotalMarks());
	        System.out.println("Student 2 Grade: " + student2.calculateGrade());
	    }
	}


