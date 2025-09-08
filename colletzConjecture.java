package dailyquestions;
import java.util.*;
public class colletzConjecture {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int k = sc.nextInt();
            int x = sc.nextInt();
            while(k-- > 0){
                if((x - 1)%3==0){
                    x = (x-1)/3;
                }else{
                    x = 2 * x;
                }
            }
            System.out.println(x);
        }
    }
}
