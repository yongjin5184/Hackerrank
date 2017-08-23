import java.util.Scanner;

/**
 * Created by yongjin on 2017-08-23.
 * Day 14: Scope
 */
class Difference{

    private int[] elements;
    public int maximumDifference;

    Difference(int[] a){
        this.elements = a;
    }

    public void computeDifference(){
        int max = 0;
        int min = 101;
        for(int i = 0; i < elements.length; i++){
            if(max < elements[i]){
                max = elements[i];
            }

            if(min > elements[i]){
                min = elements[i];
            }
        }
        maximumDifference = max - min;
    }
}

public class Day14 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
