package dailyquestions;
import java.util.*;
public class maxEvenSum {
    public static long evenSum(long a, long b){
        if(b % 2 != 0){
            if(a % 2 != 0){
                return a * b + 1;
            }else{
                return -1;
            }
        }
        long ans = (a * b)/2 + 2;
        if(ans % 2 == 0){
            return ans;
        }
        return -1;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println(evenSum(a,b));
        }
    }
}
