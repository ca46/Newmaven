package helloworld2;

public class PalindromeCheck {
	

	    
	    public static boolean isPalindrome(String str) {
	        str = str.toLowerCase(); 
	        int start = 0;
	        int end = str.length() - 1;

	        while (start < end) {
	            if (str.charAt(start) != str.charAt(end)) {
	                return false;
	            }
	            start++;
	            end--;
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        String word1 = "Java";
	        String word2 = "Malayalam";

	        System.out.println(word1 + " is palindrome? " + isPalindrome(word1));
	        System.out.println(word2 + " is palindrome? " + isPalindrome(word2));
	    }
	}


