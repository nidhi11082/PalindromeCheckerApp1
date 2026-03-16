import java.util.Stack;

public class UseCase5_StackPalindrome {

    public static void main(String[] args) {

        String word = "madam";

        // Create stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for(int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop characters and compare
        for(int i = 0; i < word.length(); i++) {

            char poppedChar = stack.pop();

            if(word.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if(isPalindrome) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}