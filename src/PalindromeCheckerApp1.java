public class PalindromeCheckerApp1 {

    public static void main(String[] args) {

        String word = "madam";   // original string
        String reversed = "";    // reversed string

        // Reverse the string using loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Compare original and reversed
        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }

    }
}