import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by yong on 2017. 8. 31..
 * Day 18: Queues and Stacks
 */
public class Day18 {

    public Stack<Character> myStack = new Stack<Character>();
    public LinkedList<Character> myQueue = new LinkedList<Character>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18 p = new Day18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            System.out.println("stack = " + p.popCharacter());
            System.out.println("queue = " + p.dequeueCharacter());

            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }

    //List
    public void pushCharacter(char c){
         myStack.push(c);
    }

    public char popCharacter(){
        return myStack.pop();
    }

    //Queue
    public void enqueueCharacter(char ch){
        myQueue.add(ch);
    }

    public char dequeueCharacter(){
        return myQueue.removeFirst();
    }
}
