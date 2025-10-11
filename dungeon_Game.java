package dailyquestions;

import java.util.Arrays;
import java.util.HashMap;

public class dungeon_Game {
    // memoize
    // static HashMap<String, Boolean> map = new HashMap<>();
    // public static String getKey(int mid, int i, int j) {
    //     StringBuilder key = new StringBuilder();
    //     key.append(i).append("_").append(j).append("_").append(mid);

    //     return key.toString();
    // }
    // public static boolean canSurvive(int[][] dungeon, int mid, int i, int j) {
    //     int n = dungeon.length;
    //     int m = dungeon[0].length;
    //     if(i >= n  || j >= m){
    //         return false;
    //     }

    //     mid += dungeon[i][j];
    //     if(mid <= 0){
    //         return false;
    //     }

    //     if(i == n - 1 && j == m - 1){
    //         return true;
    //     }
    //     String key = getKey(mid, i, j);
    //     if(map.containsKey(key)){
    //         return map.get(key);
    //     }

    //     boolean right = canSurvive(dungeon, mid, i, j + 1);
    //     boolean down = canSurvive(dungeon, mid, i + 1, j);

    //     map.put(key, right || down);

    //     return map.get(key);
    // }

    // grid[i][j]
    // m * n with memoization -> without 2^m*n
    public static int canSurvive(int[][] dungeon, int i, int j, int[][] dp){
        int n = dungeon.length;
        int m = dungeon[0].length;
        if(i >= n  || j >= m){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(i == n - 1  || j == m - 1){
            if(dungeon[i][j] <= 0){
                return 1 + Math.abs(dungeon[i][j]);
            }
            return 1;
        }


        int right = canSurvive(dungeon, i, j + 1, dp);
        int down = canSurvive(dungeon, i + 1, j, dp);
        
        int health = Math.min(right, down) - dungeon[i][j];
       
        return dp[i][j] = health > 0 ? health : 1;
    }

    public static int calculateMinimumHP(int[][] dungeon) {
        int n = dungeon.length;
        int m = dungeon[0].length;
        
        // int l =1;
        // int r = 40000000;
        // while(l <= r){
        //     int mid = l + (r - l)/2;
        //     if(canSurvive(dungeon, mid, 0, 0)){
        //         r = mid - 1;
        //     }else{
        //         l = mid + 1;
        //     }
        // }
        // return l;

        // ----------- propagation bottom to top
        int[][] dp = new int[n][m];
        for (int[] d : dp) {
            Arrays.fill(d, -1);
        }
        return canSurvive(dungeon, 0, 0, dp);
    }
    public static void main(String[] args) {
        int[][] dungeon = {{-2,-3,3},{-5,-10,1},{10,30,-5}};
        System.out.println(calculateMinimumHP(dungeon));
    }
}
