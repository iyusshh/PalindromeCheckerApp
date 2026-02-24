import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert string to character array
        char[] chars = input.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while (left < right) {

            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}