import java.util.Scanner;

/**
 * Created by yong on 2017. 8. 19..
 * Day 10: Binary Numbers
 */
public class Day10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int maxNumber = getMaxConsecutiveBinary(n);
        System.out.print(maxNumber);
    }

    public static int getMaxConsecutiveBinary(int n){
        String str = Integer.toBinaryString(n);
        int maxConsecutive = 0;
        int num = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1') {
                num++;
            }else{
                num = 0;
            }

            if(maxConsecutive < num) {
                maxConsecutive = num;
            }
        }

        return maxConsecutive;
    }
}
