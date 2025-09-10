package dailyquestions;

import java.util.*;
public class uniqueTree {
    class Solution {
    public int numSubTrees(int n, int[] dp) {
        if(n <= 1){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int ans = 0;
        for(int i=1;i<=n;i++){
            ans +=  numSubTrees(i - 1, dp) * numSubTrees(n-i, dp);
        }
        return dp[n] = ans;
    }
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return numSubTrees(n, dp);

    }
}
}
