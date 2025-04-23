package helloworld2;

public class Main2 {
	public static void main(String[] args) {
        
        Student student = new Student();
        Address address = new Address();
        
       
        student.getStudentDetails("John Doe", 101);
        
       
        address.getAddress("1234 Elm Street, Springfield, IL");
        
       
        address.printStudentDetails(student);
    }
}
