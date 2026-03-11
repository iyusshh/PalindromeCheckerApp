import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    // Function to check palindrome ignoring spaces and case
    public static boolean isPalindrome(String input) {

        // Normalize the string
        // 1. Convert to lowercase
        // 2. Remove spaces using regex
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        int left = 0;
        int right = normalized.length() - 1;

        // Palindrome check using two pointers
        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The given string is a palindrome (ignoring spaces and case).");
        } else {
            System.out.println("The given string is NOT a palindrome.");
        }

        sc.close();
    }
}