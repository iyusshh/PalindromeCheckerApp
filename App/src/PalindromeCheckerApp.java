
import java.util.Scanner;



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

    // Recursive function
    public static boolean checkPalindrome(String str, int start, int end) {

        // Base condition: crossed pointers or single character
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call for inner substring
        return checkPalindrome(str, start + 1, end - 1);
    }
}