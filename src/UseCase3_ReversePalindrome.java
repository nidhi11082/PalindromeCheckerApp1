public class UseCase3_ReversePalindrome {

    public static void main(String[] args) {

        String word = "level";   // original string
        String reversed = "";    // reversed string

        // Reverse using loop
        for(int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Compare original and reversed
        if(word.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}