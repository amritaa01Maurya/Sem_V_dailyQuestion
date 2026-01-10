package dailyquestions;

import java.util.*;

public class buns {
    public static int solve(int n, int m, int[][] arr, int i, int c, int d, int[][] dp){
        if(n < 0){
            return 0;
        }

        if(i == m){
            int stuffLess = (n / c) * d;
            return stuffLess;
        }

        if(dp[n][i] != -1){
            return dp[n][i];
        }
        int price = 0;
        int leftStuffing_i = arr[i][0];
        int reqStuffing_i = arr[i][1];
        int reqDough_i = arr[i][2];
        int priceStuffing_i = arr[i][3];
        int totBuns = leftStuffing_i / reqStuffing_i;
        for(int j=0;j <= totBuns;j++){
            int currReqDough = j * reqDough_i;
            if(currReqDough <= n){
                price = Math.max(price, j * priceStuffing_i + solve(n - currReqDough, m, arr, i+1, c, d, dp));
            }else{
                break;
            }
        }

        return dp[n][i] = price;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int[][] arr = new int[m][4];
        for(int i=0;i<m;i++){
            for(int j=0;j<4;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] dp =new int[n+1][m];
        for(int[] dpp:dp){
            Arrays.fill(dpp, -1);
        }
        int ans = solve(n, m, arr, 0, c, d, dp);
        System.out.println(ans);
    }
}
