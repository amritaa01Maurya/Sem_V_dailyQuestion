package dailyquestions;

import java.util.*;
public class bePos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int count_1 = 0;
            int count_0 = 0;
            for(int i=0;i<n;i++){
                int num = sc.nextInt();
                if(num == -1){
                    count_1++;
                }else if(num ==0){
                    count_0++;
                }
            }
            int ans = 0;
            if(count_1 % 2 != 0){
                ans += 2;
            }
            if(count_0 > 0){
                ans += count_0;
            }
            System.out.println(ans);
        }  
        
    }
}
