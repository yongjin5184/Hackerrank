import java.util.Scanner;

/**
 * Created by yong on 2017. 8. 31..
 * Day 19: Interfaces
 */

interface AdvancedArithmetic{
    int divisorSum(int n);
}

class Calculator02 implements AdvancedArithmetic{
    public int divisorSum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if( n % i == 0 ) {
                sum += i;
            }
        }

        return sum;
    }
}

public class Day19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator02();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
