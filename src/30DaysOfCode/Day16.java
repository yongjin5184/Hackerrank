import java.util.Scanner;

/**
 * Created by yong on 2017. 8. 31..
 * Exceptions - String to Integer
 */
public class Day16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            Integer.parseInt(S);
            System.out.print(S);
        }catch(NumberFormatException e){
            System.out.print("Bad String");
        }
    }
}
