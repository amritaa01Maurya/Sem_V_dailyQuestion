package dailyquestions;

import java.util.*;
public class unconventionalpair {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while(t-- > 0){
            int n = sc.nextInt(); 
            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr); 

            int maxDiff = 0;

            for(int i = 0; i < n; i += 2){
                int diff = Math.abs(arr[i] - arr[i+1]);
                maxDiff = Math.max(maxDiff, diff);
            }

            System.out.println(maxDiff);
        }
}

}
