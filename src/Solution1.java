import java.util.Scanner;

/**
 * Created by yongjin on 2017-08-10.
 */
public class Solution1 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        Integer inputInteger = 0;
        Double inputDouble = 0.0;
        String inputString = "";

        /* Declare second integer, double, and String variables. */
        inputInteger = Integer.parseInt(scan.nextLine());
        inputDouble = Double.parseDouble(scan.nextLine());
        inputString = scan.nextLine();
        /* Read and save an integer, double, and String to your variables.*/


        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        System.out.println(i + inputInteger);
        /* Print the sum of both integer variables on a new line. */
        System.out.println(d + inputDouble);
        /* Print the sum of the double variables on a new line. */
        System.out.print(s + inputString);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */

    }
}
