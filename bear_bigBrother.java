package dailyquestions;

import java.util.*;
public class bear_bigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int year = 0;
        while( a <= b){
            year++;
            a *= 3;
            b *= 2;
        }
        System.out.println(year);
    }

}
