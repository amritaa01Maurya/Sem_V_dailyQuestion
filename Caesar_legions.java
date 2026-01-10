package dailyquestions;

import java.util.Arrays;
import java.util.Scanner;

public class Caesar_legions {
    static int mod = 100000000;
    public static int solve(int n1, int n2, int k1, int k2, int c1, int c2, char prev, int[][][][] dp){
        if(n1 < 0 || n2 < 0){
            return 0;
        }
        if(n1 == 0 && n2 == 0){
            return 1;
        }
        if(dp[n1][n2][prev == 'f' ? c1 : c2][prev == 'f' ? 0 : 1] != -1){
            return dp[n1][n2][prev == 'f' ? c1 : c2][prev == 'f' ? 0 : 1];
        }
        int ans = 0;
        if((prev != 'f' || c1 < k1)){
            ans += solve(n1 - 1, n2, k1, k2, c1 + 1, 0, 'f', dp);
        }
        if((prev != 'h' || c2 < k2)){
            ans += solve(n1, n2 - 1, k1, k2, 0, c2 + 1, 'h', dp);
        }
        return dp[n1][n2][prev == 'f' ? c1 : c2][prev == 'f' ? 0 : 1] = ans % mod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int k1 = sc.nextInt();
        int k2 = sc.nextInt();
        int[][][][] dp = new int[n1 + 1][n2 + 1][Math.max(k1, k2) + 1][2];
        for(int[][][] i: dp){
            for(int[][] j: i){
                for(int[] p: j){
                    Arrays.fill(p, -1);
                }
            }
        }
        int ans = solve(n1, n2, k1, k2, 0, 0, '#', dp);
        System.out.println(ans);

    }
}
