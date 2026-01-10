package dailyquestions;

import java.util.*;

public class least_round_way {
    public static int factors(int num, int k){
        int count = 0;
        if(num == 0){
            return 100000;
        }
        while(num > 0 && num % k == 0){
            num /= k;
            count++;
        }
        return count;
    }

    public static String getZeroPath(int[] zero, int n){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<zero[0];i++){
            sb.append('D');
        }
        for(int i=0;i<zero[1];i++){
            sb.append('R');
        }
        for(int i=zero[0];i<n-1;i++){
            sb.append('D');
        }
        for(int i=zero[1];i<n-1;i++){
            sb.append('R');
        }

        return sb.toString();
    }

    public static String getPath(char[][] path){
        int n = path.length;
        StringBuilder sb = new StringBuilder();
        int i = n -1;
        int j = n -1;
        while(i > 0 || j > 0){
            sb.append(path[i][j]);

            if(path[i][j] == 'R'){
                j -= 1; 
            }else{
                i -= 1;
            }
        }
        return sb.reverse().toString();
    }
    public static int solve(int[][] mat, int[][] dp, char[][] path){
        int n =mat.length;

        dp[0][0] = mat[0][0];
        for(int i=1;i<n;i++){
            dp[0][i] = dp[0][i-1] + mat[0][i];
            path[0][i] = 'R';
        }

        for(int i=1;i<n;i++){
            dp[i][0] = dp[i-1][0] + mat[i][0];
            path[i][0]= 'D';
        }


        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if(dp[i][j-1] < dp[i-1][j]){
                    dp[i][j] = mat[i][j] + dp[i][j-1];
                    path[i][j] = 'R';
                }else{
                    dp[i][j] = mat[i][j] + dp[i-1][j];
                    path[i][j] = 'D';
                }
            }
        }
        return dp[n-1][n-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        boolean hasZero = false;
        int[] zero = {-1, -1};
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j] == 0){
                    hasZero = true;
                    zero[0] = i;
                    zero[1] = j;
                }
            }
        }
        int[][] mat2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat2[i][j] = factors(arr[i][j], 2);
            }
        }

        int[][] mat5 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat5[i][j] = factors(arr[i][j], 5);
            }
        }

        int[][] dp2 = new int[n][n];
        char[][] path2 = new char[n][n];

        int[][] dp5 = new int[n][n];
        char[][] path5 = new char[n][n];

        int score2 = solve(mat2, dp2, path2);
        int score5 = solve(mat5, dp5, path5);

        String path;
        int best = 0;

        if(hasZero && Math.min(score2, score5) > 1){
            best = 1;
            path = getZeroPath(zero, n);
        }
        else if(score2 < score5){
            path = getPath(path2);
            best = score2;
        }else{
            path = getPath(path5);
            best = score5;
        }

        System.out.println(best);
        System.out.println(path);
    }
}
