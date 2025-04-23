package helloworld2;

public class Address {
	String address;

    // Method to get the address
    public void getAddress(String address) {
        this.address = address;
    }

    // Method to print the full details of the student (name, roll number, address)
    public void printStudentDetails(Student student) {
        System.out.println("Student Name: " + student.name);
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("Address: " + this.address);
    }
}
