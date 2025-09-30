package dailyquestions;

import java.util.*;
public class halloumiBoxes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            int[] sorted = new int[n];
            for(int i=0;i<n;i++){
                int num = sc.nextInt();
                arr[i] = num;
                sorted[i] = num;
            }
            if(k >= 2){
                System.out.println("YES");
            }else if ( k == 1){
                Arrays.sort(sorted);
                boolean isSorted = true;
                for(int i=0;i<n;i++){
                    if(arr[i] != sorted[i]){
                        System.out.println("NO");
                        isSorted = false;
                        break;
                    }
                }
                if(isSorted){
                    System.out.println("YES");
                }
            }
        }
    }
}
