package dailyquestions;

import java.util.*;
public class gameWithIntegers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if(n % 3 == 0){
                System.out.println("Second");    
            }else{
                System.out.println("First");
            }
        }
    }
}
