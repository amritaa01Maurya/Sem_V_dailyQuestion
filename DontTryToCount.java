package dailyquestions;

import java.util.Scanner;

public class DontTryToCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();
            StringBuilder sb = new StringBuilder(x);
            int count = -1;
            for (int i = 0; i <= 5; i++) {
                if(sb.indexOf(s) != -1){
                    count = i;
                    break;
                }
                sb.append(sb);
            }
            System.out.println(count);
        }
    }
}
