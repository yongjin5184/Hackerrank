import java.util.Scanner;

/**
 * Created by yong on 2017. 8. 20..
 * Day 11: 2D Arrays
 */
public class Day11 {
    public static void main(String[] args) {
//        int[][] testArr = {
//                {1, 1, 1, 0, 0, 0},
//                {0, 1, 0, 0, 0, 0},
//                {1, 1, 1, 0, 0, 0},
//                {0, 0, 2, 4, 4, 0},
//                {0, 0, 0, 2, 0, 0},
//                {0, 0, 1, 2, 4, 0}
//        };

        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int sum;
        int maxSum = 0;
        for(int i = 0; i < 4; i ++){
            for(int j = 0; j < 4; j++){
                sum = arr[i][j]         + arr[i][j + 1]     + arr[i][j + 2]
                        + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                if( (i == 0 && j == 0)|| maxSum < sum) {
                    maxSum = sum;
                }
            }
        }

        System.out.print(maxSum);
    }
}
