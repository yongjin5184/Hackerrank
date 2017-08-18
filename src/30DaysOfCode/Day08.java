import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by yongjin on 2017-08-17.
 * Day 8: Dictionaries and Maps
 */
public class Day08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        HashMap<String, Integer> hMap = new HashMap<String, Integer>();
        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            hMap.put(name, phone);
        }

        while(in.hasNext()){

            String s = in.next();
            list.add(s);

            if(list.size() >= n)
                break;
        }

        for(int i = 0; i < list.size(); i++) {
            if (hMap.containsKey(list.get(i))) {
                System.out.println(list.get(i) + "=" + hMap.get(list.get(i)));
            } else {
                System.out.println("Not found");
            }
        }

        in.close();
    }
}
