package dailyquestions;

import java.util.Arrays;

public class climbingStairs_II {
    public static int climbStairs(int n, int[] costs) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=1;i <= n;i++){
            for (int j = 1; j < 4; j++) { // steps 1,2,3
                if(i - j >= 0){
                    dp[i]  = Math.min(dp[i], dp[i-j] + costs[i-1] + j*j);
                }
            }
        }
        

        return dp[n];
    }
        public static void main(String[] args) {
        int n = 4;
        int[] c = {1,2,3,4};
        // int[] c = {0,1,2,3,4};

        System.out.println(climbStairs(n, c));
    }
}
