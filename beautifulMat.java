package dailyquestions;

import java.util.*;
public class beautifulMat {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int m = 0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                int num = sc.nextInt();
                if(num == 1){
                    n = i;
                    m = j;
                }
            }
        }
        System.out.println(Math.abs(3 - n)+Math.abs(3 - m));
    }
}
