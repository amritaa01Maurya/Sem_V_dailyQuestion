package dailyquestions;

import java.util.*;
public class cyclic_permuta {

    static long mod = 1000000007;
    public static long power(long n, long b){
        long res = 1;

        while(n != 0){
            if((n & 1 ) == 1){
                res = (res * b) % mod;
            }
            b = (b * b) % mod;
            n = n >> 1;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long nth_per = 1;
        for(int i=n;i>0;i--){
            nth_per = (nth_per * i) % mod;
        }
        
        long acyclic_per = power(n - 1, 2);
        
        long cyclic_per = (nth_per - acyclic_per + mod) % mod;
        
        System.out.println(cyclic_per);
    }
}
