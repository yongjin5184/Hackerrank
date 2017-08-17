import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by yongjin on 2017-08-11.
 */
public class Day02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        DecimalFormat format = new DecimalFormat("#.##");
        // Write your calculation code here.
        double tip = mealCost * ( (double)tipPercent / 100);
        double tax = mealCost * ( (double)taxPercent / 100);

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(mealCost + tip + tax);
        System.out.print(tip);
//        System.out.print("The total meal cost is " + totalCost + " dollars");
        // Print your result
    }
}
