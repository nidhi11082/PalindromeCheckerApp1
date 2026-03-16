public class UseCase10_NormalizedPalindrome {

    public static void main(String[] args) {

        String text = "A man a plan a canal Panama";

        // Normalize string: remove spaces and convert to lowercase
        String normalized = text.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        boolean isPalindrome = true;

        // Compare characters
        while(start < end) {

            if(normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        if(isPalindrome) {
            System.out.println("\"" + text + "\" is a palindrome");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome");
        }
    }
}