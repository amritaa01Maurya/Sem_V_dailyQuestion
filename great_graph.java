package dailyquestions;

import java.util.Arrays;
import java.util.Scanner;

public class great_graph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            long[] prefix = new long[n];
            prefix[0] = arr[0];
            for(int i=1;i<n;i++){
                prefix[i] = prefix[i-1] + arr[i];
            }

            long sum = arr[n-1];
            for(int i=1;i<n;i++){
                sum += (prefix[i-1] - i * arr[i]);
            }

            System.out.println(sum);
        }
    }
}
