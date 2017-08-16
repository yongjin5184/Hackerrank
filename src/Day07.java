import java.util.Scanner;

/**
 * Created by yongjin on 2017-08-16.
 * Day 7: Arrays
 */
public class Day07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        int arrLength = arr.length - 1;
        for(int i = arrLength; i > -1; i--){
            System.out.print(arr[i] + " ");
        }
        in.close();
    }
}
