package helloworld2;

import java.util.Scanner;

public class User {
	public int getPinFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        return scanner.nextInt();  // Returns the pin entered by the user
    }
}
