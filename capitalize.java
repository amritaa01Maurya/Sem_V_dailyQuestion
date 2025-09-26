package dailyquestions;

import java.util.*;
public class capitalize {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
        System.out.println(ans);
    }

}
