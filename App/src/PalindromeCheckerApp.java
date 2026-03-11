import java.util.Scanner;

// Service class that encapsulates palindrome logic
class PalindromeChecker {

    // Method to check if a string is palindrome
    public boolean checkPalindrome(String input) {

        // Normalize string (ignore case and spaces)
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
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is NOT a palindrome.");
        }

        sc.close();
    }
}