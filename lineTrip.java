package dailyquestions;

import java.util.*;

public class lineTrip {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] station = new int[n];
            for (int i = 0; i < n; i++) {
                station[i] = sc.nextInt();
            }
            int minFuel = station[0];
            for(int i=0;i<n-1;i++){
                minFuel = Math.max(minFuel, station[i+1] - station[i]);
            }
            minFuel = Math.max(minFuel, 2 * (x - station[n-1]));

            System.out.println(minFuel);
        }
    }
}
