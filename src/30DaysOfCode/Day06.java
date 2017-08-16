import java.util.Scanner;

/**
 * Created by yong on 2017. 8. 15..
 * Day 6: Let's Review
 */
public class Day06 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cnt = Integer.parseInt(scan.nextLine());
        String[] strArr = new String[cnt];

        for(int i = 0; i < cnt; i++){
            strArr[i] = scan.nextLine();
        }

        for(int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            String evenStr = "";
            String oddStr = "";

            for (int j = 0; j < str.length(); j++) {
                if (j % 2 == 0) {
                    //even
                    evenStr += str.charAt(j);
                } else {
                    //odd
                    oddStr += str.charAt(j);
                }
            }

            System.out.println(evenStr + " " + oddStr);
        }
    }
}
