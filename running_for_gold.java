package dailyquestions;

import java.util.*;

public class running_for_gold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[][] arr = new int[n][5];
            for(int i=0;i<n;i++){
                for(int j=0;j<5;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            int[] temp=arr[0];
            int winner = 0;
            for(int i=1;i<n;i++){
                int bestWins =0;
                for(int k=0;k<5;k++){
                    if(temp[k] < arr[i][k]){
                        bestWins++;
                    }
                }
                if(bestWins < 3){
                    temp = arr[i];
                    winner = i;
                }
            }
            boolean flag = true;
            for(int i=0;i<n;i++){
                if(winner != i){
                    int bestWins =0;
                    for(int k=0;k<5;k++){
                        if(temp[k] < arr[i][k]){
                            bestWins++;
                        }
                    }
                    if(bestWins < 3){
                        flag = false;
                        break;
                    }
                }   
            }
            if(!flag){
                System.out.println(-1);
                continue;
            }
            System.out.println(winner+1);
        }
    }
}
