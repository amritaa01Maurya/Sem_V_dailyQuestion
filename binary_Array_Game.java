package dailyquestions;

import java.util.Scanner;

public class binary_Array_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int one  = 0;
            int zero = 0;
            boolean firstOne = false;
            boolean lastOne = false;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                if(arr[i] == 0) zero++;
                if(arr[i] == 1) one++;
                if(i==0 && arr[i] == 1) firstOne = true;
                if(i==n-1 && arr[i] == 1) lastOne = true;
            }
            if(one == 0){
                System.out.println("bob");
            }else if(zero == 0){
                System.out.println("alice");
            }else if(firstOne || lastOne){
                System.out.println("alice");
            }else{
                System.out.println("bob");
            }
        }
    }
}
