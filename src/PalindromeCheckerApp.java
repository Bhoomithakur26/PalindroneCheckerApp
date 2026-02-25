public class PalindromeCheckerApp {
    public static void main(String[] args) {
System.out.println ("Welcome to the Palindrome Checker management system");
        System.out.println ("Modify this logic to usecase 2");
        System.out.println ("Version : 1.0");
        System.out.println ("System initialized Successfully");
        public class UseCase2PalindromeCheckerApp
        {

            public static void main(String[] args) {

                // Hardcoded string
                String word = "madam";

                // Reverse the string
                String reversed = "";
                for (int i = word.length() - 1; i >= 0; i--) {
                    reversed = reversed + word.charAt(i);
                }

                // Check if palindrome
                if (word.equals(reversed)) {
                    System.out.println(word + " is a Palindrome.");
                } else {
                    System.out.println(word + " is not a Palindrome.");
                }
            }

            //USECASE 3
            public class UseCase3PalindromeCheckerApp {

                public static void main(String[] args) {

                    String original = "madam";

                    String reversed = "";

                    for (int i = original.length() - 1; i >= 0; i--) {
                        reversed = reversed + original.charAt(i);
                    }

                    if (original.equals(reversed)) {
                        System.out.println(original + " is a Palindrome.");
                    } else {
                        System.out.println(original + " is not a Palindrome.");
                    }
                }
            }
UseCase4PalindromeCheckerApp {

                public static void main(String[] args) {
                    String input = "radar";
                    char[] chars = input.toCharArray();
                    int start = 0;
                    int end = chars.length - 1;
                    boolean isPalindrome = true;
                    while (start < end) {
                        if (chars[start] != chars[end]) {
                            isPalindrome = false;
                            break;
                        }
                        start++;
                        end--;
                    }
                    System.out.println("Input : " + input);
                    System.out.println("Is Palindrome? : " + isPalindrome);
                }
            }
        }
        public class UseCase5PalindromeCheckerApp {

            /**
             * Application entry point for UC5.
             * @param args Command-line arguments
             */
            public static void main(String[] args) {

                // Declare and initialize input string
                String input = "noon";

                // Create a Stack to store characters
                Stack<Character> stack = new Stack<>();

                // Push each character into stack
                for (char c : input.toCharArray()) {
                    stack.push(c);
                }

                // Assume palindrome initially
                boolean isPalindrome = true;

                // Pop and compare with original string
                for (char c : input.toCharArray()) {
                    if (c != stack.pop()) {
                        isPalindrome = false;
                        break;
                    }
                }

                // Display result
                System.out.println("Input : " + input);
                System.out.println("Is Palindrome? : " + isPalindrome);
            }
    }

}
