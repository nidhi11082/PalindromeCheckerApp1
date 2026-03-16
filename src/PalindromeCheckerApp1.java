public class PalindromeCheckerApp1 {

    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Variable for reversed string
        String reversed = "";

        // Reverse the string
        for(int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check if palindrome
        if(word.equals(reversed)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }

    }
}