public class UseCase2_HardcodedPalindrome {

    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Reverse string
        String reversed = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check palindrome
        if(word.equals(reversed)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }

    }
}