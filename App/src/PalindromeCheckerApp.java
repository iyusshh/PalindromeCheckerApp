
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



import java.util.Scanner;


// Service class that encapsulates palindrome logic
class PalindromeChecker {


public class UseCase10PalindromeCheckerApp {


    // Method to check if a string is palindrome

    public boolean checkPalindrome(String input) {


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