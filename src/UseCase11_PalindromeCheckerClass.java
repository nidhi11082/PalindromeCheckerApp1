// PalindromeChecker class encapsulating the logic
class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String word) {

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {

            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}

public class UseCase11_PalindromeCheckerClass {

    public static void main(String[] args) {

        String word = "madam";

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        // Call method
        boolean result = checker.checkPalindrome(word);

        if (result) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}