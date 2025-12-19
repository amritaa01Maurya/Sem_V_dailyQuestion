package dailyquestions;

import java.util.Scanner;

public class sleepingThrough {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int count = 0;
            int canSleep = -1;
            for (int i = 0; i < n;i++) {
                if (s.charAt(i) == '1') {
                    canSleep= k + i;
                }else{
                    if(i > canSleep) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
