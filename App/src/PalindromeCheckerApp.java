import java.util.*;

public class UseCase13PalindromeCheckerApp {

    // Method 1: Two Pointer (Array)
    public static boolean arrayPalindrome(String input) {

        String normalized = input.toLowerCase().replaceAll("\\s+", "");
        char[] arr = normalized.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method 2: Stack
    public static boolean stackPalindrome(String input) {

        String normalized = input.toLowerCase().replaceAll("\\s+", "");
        Stack<Character> stack = new Stack<>();

        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Method 3: Deque
    public static boolean dequePalindrome(String input) {

        String normalized = input.toLowerCase().replaceAll("\\s+", "");
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : normalized.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Array method timing
        long start1 = System.nanoTime();
        boolean result1 = arrayPalindrome(input);
        long end1 = System.nanoTime();

        // Stack method timing
        long start2 = System.nanoTime();
        boolean result2 = stackPalindrome(input);
        long end2 = System.nanoTime();

        // Deque method timing
        long start3 = System.nanoTime();
        boolean result3 = dequePalindrome(input);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");

        System.out.println("Array Method Result: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Method Result: " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Deque Method Result: " + result3 +
                " | Time: " + (end3 - start3) + " ns");

        sc.close();
    }
}