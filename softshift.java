package dailyquestions;

import java.util.*;

public class softshift {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            int zeros = 0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='0'){
                    zeros++;
                }
            }
            int ones = 0;
            for(int i=0;i<zeros;i++){
                if(s.charAt(i)=='1'){
                    ones++;
                }
            }
            if(zeros == n || zeros == 0){
                System.out.println(0);
            }else{
                System.out.println(ones);
            }
            
        }
    } 
}
