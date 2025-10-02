package dailyquestions;

import java.util.*;
public class halloumiBoxes {
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; 
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                int num = sc.nextInt();
                arr[i] = num;
            }
            if(k >= 2){
                System.out.println("YES");
            }else if ( k == 1){
                if(isSorted(arr)){
                    System.out.println("YES");
                }else{
                     System.out.println("NO");
                }
            }
        }
    }
}
