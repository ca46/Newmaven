package helloworld2;

class DivisibilityCheck extends Addition {
	public void checkDivisibility(int num1, int num2) {
        int result = addNumbers(num1, num2); // Calling the addNumbers method using 'super'
        if (result % 10 == 0) {
            System.out.println("The addition result " + result + " is divisible by 10.");
        } else {
            System.out.println("The addition result " + result + " is NOT divisible by 10.");
        }
    }
}
