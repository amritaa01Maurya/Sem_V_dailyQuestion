package dailyquestions;

import java.util.*;

public class cutArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0; i<n; i++){ 
                arr[i] = sc.nextInt();
            }
            int l_ = 0;
            int r_ = 0;
            int[] prefix = new int[n];
            prefix[0] = arr[0];
            for (int i=1; i < n; i++) {
                prefix[i] = prefix[i-1] + arr[i];
            }
            boolean found = false;
            for (int l= 0; l < n - 2 && !found ; l++) {
                for (int r=l + 1; r < n - 1 && !found; r++) {
                    int sum1 = (prefix[l]) % 3;
                    int sum2 = (prefix[r] - prefix[l]) % 3;
                    int sum3 = (prefix[n-1] - prefix[r]) % 3;

                    if ((sum1==sum2 && sum2==sum3) ||
                        (sum1!=sum2 && sum1!=sum3 && sum2!=sum3)) {
                            l_ = l + 1;
                            r_ = r + 1;
                            found = true;
                            break;
                        }
                    }
                }
            System.out.println(l_ + " " + r_);
        }
    }
}