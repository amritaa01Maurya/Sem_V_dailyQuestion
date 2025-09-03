package dailyquestions;

import java.util.Arrays;

public class houseRobberII {
    class Solution {
        public int dfs(int[] nums, int i,int m, int[] dp) {
            if(i >= m){
                return 0;
            }
            if(dp[i] != -1){
                return dp[i];
            }

            int take = nums[i] + dfs(nums, i + 2, m,dp);
            int skip = dfs(nums, i + 1, m,dp);

            return dp[i] = Math.max(take, skip);
        }
        public int rob(int[] nums) {
            int n = nums.length;
            if(n == 1){
                return nums[0];
            }

            int[] dp = new int[nums.length + 1];
            Arrays.fill(dp, -1);
            int rob1 = dfs(nums,0,n-1,dp);

            int[] dp2 = new int[nums.length + 1];
            Arrays.fill(dp2, -1);
            int rob2 = dfs(nums,1,n,dp2);

            return Math.max(rob1, rob2);
        }
    }
}
