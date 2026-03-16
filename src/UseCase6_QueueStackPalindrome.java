import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class UseCase6_QueueStackPalindrome {

    public static void main(String[] args) {

        String word = "madam";

        // Create Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert characters into queue and stack
        for(int i = 0; i < word.length(); i++) {
            queue.add(word.charAt(i));   // enqueue
            stack.push(word.charAt(i));  // push
        }

        boolean isPalindrome = true;

        // Compare dequeue and pop
        while(!queue.isEmpty()) {

            char fromQueue = queue.remove(); // dequeue
            char fromStack = stack.pop();    // pop

            if(fromQueue != fromStack) {
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