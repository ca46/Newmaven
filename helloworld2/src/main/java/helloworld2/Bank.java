package helloworld2;

public class Bank {
	// Private variable to store the pin
    private int pin;

    // Method to set the pin from User class
    public void setPin(int pin) {
        this.pin = pin;
}

    // Method to validate the pin
    public boolean validatePin() {
        // Valid pins: 1001, 1234, 1212
        if (this.pin == 1001 || this.pin == 1234 || this.pin == 1212) {
            return true;  // Pin is valid
        } else {
            return false;  // Pin is invalid
        }
    }
}
