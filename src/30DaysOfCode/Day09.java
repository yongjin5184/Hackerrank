import java.util.Scanner;

/**
 * Created by yongjin on 2017-08-18.
 * Day 9: Recursion
 */
public class Day09 {

    static int factorial(int n) {
        // Complete this function
        if(n <= 1){
            return n;
        }else{
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}
