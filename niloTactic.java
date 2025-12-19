package dailyquestions;

import java.util.*;

public class niloTactic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            
            for (int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
            }

            long mink = 0;                 
            long maxk = 0; 
            for (int i = 0; i < n; i++) {

                long redMax = maxk - a[i];     
                long redMin = mink - a[i];     

                long blueMax = b[i]  - mink;     
                long blueMin = b[i] - maxk;     

                maxk = Math.max(redMax, blueMax);
                mink = Math.min(redMin, blueMin);
            }

            System.out.println(maxk);
        }
    }
}
