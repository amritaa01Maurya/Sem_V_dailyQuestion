package dailyquestions;

import java.util.*;
public class coverInWater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            int maxCount = 0;
            int tot_count = 0;
            int count = 0;
            for(int i=0;i<n;i++){
                if(s.charAt(i) == '.'){
                    count++;
                    tot_count++;
                    maxCount = Math.max(maxCount, count);
                }else{
                    count = 0;
                }
            }
            if(maxCount >= 3){
                System.out.println(2);
            }else {
                System.out.println(tot_count);
            }
        }
    }
}
