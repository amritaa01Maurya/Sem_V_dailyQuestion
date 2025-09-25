package dailyquestions;

import java.util.*;
public class MEX {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            HashSet<Integer> seen = new HashSet<>();
            int countK = 0;

            for(int i = 0; i < n; i++){
                int num = sc.nextInt();
                if(num == k) countK++;
                if(num < k){
                    seen.add(num);
                }
            }

            int missedCount = 0;
            for(int i = 0; i < k; i++){
                if(!seen.contains(i)){
                    missedCount++;
                }
            }

            System.out.println(Math.max(missedCount,countK));
        }

    }

}
