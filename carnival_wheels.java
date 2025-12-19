package dailyquestions;

import java.util.Scanner;

public class carnival_wheels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int l = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            boolean[] vis= new boolean[l];
            int max = 0;
            int curr = a;
            while(!vis[curr]){
                vis[curr] = true;
                max = Math.max(max, curr);
                curr = (curr + b)%l;
            }
            System.out.println(max);
        }
    }
}
