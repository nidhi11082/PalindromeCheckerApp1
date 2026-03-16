import java.util.Stack;

public class UseCase13_PerformanceComparison {

    // Method 1: Reverse string
    public static boolean reverseMethod(String word) {

        String reversed = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return word.equals(reversed);
    }

    // Method 2: Two pointer technique
    public static boolean twoPointerMethod(String word) {

        int start = 0;
        int end = word.length() - 1;

        while(start < end) {

            if(word.charAt(start) != word.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    // Method 3: Stack method
    public static boolean stackMethod(String word) {

        Stack<Character> stack = new Stack<>();

        for(char c : word.toCharArray()) {
            stack.push(c);
        }

        for(int i = 0; i < word.length(); i++) {

            if(word.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "madam";

        long startTime, endTime;

        // Reverse method timing
        startTime = System.nanoTime();
        reverseMethod(word);
        endTime = System.nanoTime();
        System.out.println("Reverse Method Time: " + (endTime - startTime) + " ns");

        // Two pointer method timing
        startTime = System.nanoTime();
        twoPointerMethod(word);
        endTime = System.nanoTime();
        System.out.println("Two Pointer Method Time: " + (endTime - startTime) + " ns");

        // Stack method timing
        startTime = System.nanoTime();
        stackMethod(word);
        endTime = System.nanoTime();
        System.out.println("Stack Method Time: " + (endTime - startTime) + " ns");
    }
}