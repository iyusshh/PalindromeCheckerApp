
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



import java.util.Deque;
import java.util.ArrayDeque;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;



public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        boolean isPalindrome = checkPalindrome(input, 0, input.length() - 1);

        // Convert string to linked list
        Node head = null;
        Node tail = null;


        Deque<Character> deque = new ArrayDeque<>();


        for (int i = 0; i < input.length(); i++) {

            Node newNode = new Node(input.charAt(i));

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;

            deque.addLast(input.charAt(i));

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Push to stack and enqueue to queue
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);     // LIFO
            queue.add(ch);      // FIFO

        }

        boolean isPalindrome = true;


        // Compare front and rear characters
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear  = deque.removeLast();

            if (front != rear) {

        // Compare pop (stack) vs dequeue (queue)
        for (int i = 0; i < input.length(); i++) {

            char fromStack = stack.pop();     // reverse order
            char fromQueue = queue.remove(); // original order

            if (fromStack != fromQueue) {

                isPalindrome = false;
                break;

            }
        }

        boolean isPalindrome = checkPalindrome(head);


        if (isPalindrome) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();

        String word = "madam";   // Hardcoded string
        String reversed = "";

        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check palindrome
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }

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