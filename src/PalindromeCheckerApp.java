import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker management system");
        System.out.println("Version : 1.0");
        System.out.println("System initialized Successfully\n");

        useCase2();
        useCase3();
        useCase4();
        useCase5();
        useCase6();
        useCase7();
        useCase8();
        useCase9();
        useCase10();
        useCase11();
        useCase12();
        useCase13();
    }

    // ================= USE CASE 2 =================
    static void useCase2() {
        String word = "madam";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        System.out.println("UC2 : " + word.equals(reversed));
    }

    // ================= USE CASE 3 =================
    static void useCase3() {
        String original = "madam";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        System.out.println("UC3 : " + original.equals(reversed));
    }

    // ================= USE CASE 4 =================
    static void useCase4() {
        String input = "radar";
        char[] chars = input.toCharArray();

        int start = 0, end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start++] != chars[end--]) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("UC4 : " + isPalindrome);
    }

    // ================= USE CASE 5 =================
    static void useCase5() {
        String input = "noon";
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray())
            stack.push(c);

        boolean isPalindrome = true;

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("UC5 : " + isPalindrome);
    }

    // ================= USE CASE 6 =================
    static void useCase6() {
        String input = "civic";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("UC6 : " + isPalindrome);
    }

    // ================= USE CASE 7 =================
    static void useCase7() {
        String input = "refer";
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray())
            deque.add(c);

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("UC7 : " + isPalindrome);
    }

    // ================= USE CASE 8 =================
    static void useCase8() {
        String input = "level";
        LinkedList<Character> list = new LinkedList<>();

        for (char c : input.toCharArray())
            list.add(c);

        boolean isPalindrome = true;

        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("UC8 : " + isPalindrome);
    }

    // ================= USE CASE 9 =================
    static void useCase9() {
        String input = "madam";
        System.out.println("UC9 : " + recursiveCheck(input, 0, input.length() - 1));
    }

    static boolean recursiveCheck(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return recursiveCheck(s, start + 1, end - 1);
    }

    // ================= USE CASE 10 =================
    static void useCase10() {
        String input = "A man a plan a canal Panama";
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("UC10 : " + isPalindrome);
    }

    // ================= USE CASE 11 =================
    static void useCase11() {
        String input = "racecar";
        System.out.println("UC11 : " + serviceCheck(input));
    }

    static boolean serviceCheck(String input) {
        int start = 0, end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start++) != input.charAt(end--))
                return false;
        }
        return true;
    }

    // ================= USE CASE 12 =================
    static void useCase12() {
        String input = "level";
        System.out.println("UC12 : " + stackStrategy(input));
    }

    static boolean stackStrategy(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray())
            stack.push(c);

        for (char c : input.toCharArray())
            if (c != stack.pop()) return false;

        return true;
    }

    // ================= USE CASE 13 =================
    static void useCase13() {
        String input = "level";

        long startTime = System.nanoTime();
        boolean result = serviceCheck(input);
        long endTime = System.nanoTime();

        System.out.println("UC13 : " + result + " | Time = " + (endTime - startTime) + " ns");
    }
}