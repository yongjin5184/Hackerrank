import java.util.Scanner;

/**
 * Created by yongjin on 2017-08-14.
 * Day 5: Loops
 */
public class Day05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n*i );
        }
    }
}
