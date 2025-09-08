package dailyquestions;

import java.util.*;

public class funPermutation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] ans = new int[n];
            for(int i=0;i<n;i++){
                int num = sc.nextInt();
                ans[i] = n - num + 1;
            }
            for(int i =0;i<n;i++){
                System.out.print(ans[i]+" "); 
            }
            System.out.println(); 
        }
    }
}
