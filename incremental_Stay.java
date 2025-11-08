package dailyquestions;

import java.util.Scanner;

public class incremental_Stay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] arr = new long[2*n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextLong();
            }
            long[] prefix = new long[2*n + 1];
            for (int i = 0; i < arr.length; i++) {
                prefix[i+1] = prefix[i] + arr[i];
            }
            long[] altsum = new long[n+1];
            altsum[n] = 0;
            for (int k = n - 1; k >= 1; k--) {
                altsum[k] = arr[k] - altsum[k+1] - arr[2*n - k - 1];
            }
            long[] ans = new long[n];
            int idx = 0;
            for (int k = 1; k <= n; k++) {
                long s1 = -prefix[k];
                long s3 = prefix[2*n] - prefix[2*n - k];
                long s2 = altsum[k];
                ans[idx++] = s1 + s2 + s3;
            }
            for (long i : ans) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
