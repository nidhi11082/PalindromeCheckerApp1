import java.util.Deque;
import java.util.LinkedList;

public class UseCase7_DequePalindrome {

    public static void main(String[] args) {

        String word = "madam";

        // Create Deque
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for(int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear characters
        while(deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if(front != rear) {
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