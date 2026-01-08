package dailyquestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class killjee_saraff {

    boolean[] primeCount;
    public static boolean[] isPrime(int n){
        boolean[] prime = new boolean[(n + 1)];
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if(!prime[i]){
                for (int j = i * i; j <= n; j+=i) {
                     prime[j] = true;
                }
            }
        }
            
        return prime;
    }
    // public static int solve(HashMap<Integer, Set<Integer>> map, int s, int d){

    // }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // HashMap<Integer, Set<Integer>> map = new HashMap<>(); 
        // for(int i=1;i<n;i++){
        //     map.put(i, new HashSet<>());
        // }
        // for(int i=1;i<n;i++){
        //     int u = sc.nextInt();
        //     int v = sc.nextInt();
        //     map.get(u).add(v);
        //     map.get(v).add(u);
        // }

        // int q = sc.nextInt();
        // for(int i=0;i<q;i++){
        //     int s = sc.nextInt();
        //     int d = sc.nextInt();
        //     int ans = solve(map, s, d);
        //     System.out.println(ans);
        // }
        System.out.println(isPrime(2147483647));
    }
}
