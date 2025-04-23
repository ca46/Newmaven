import java.util.Scanner;

public class Palindrome {

    
    public static boolean isPalindrome(String str) {
        
        str = str.toLowerCase();

       
        String reversedStr = "";

        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        
        return str.equals(reversedStr);
    }

    public static void main(String[] args) {
        
        String[] testStrings = {"Java", "Malayalam"};

        for (String str : testStrings) {
            
            if (isPalindrome(str)) {
                System.out.println(str + " is a palindrome.");
            } else {
                System.out.println(str + " is not a palindrome.");
            }
        }
    }
}
