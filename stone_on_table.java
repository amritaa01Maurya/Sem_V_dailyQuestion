package dailyquestions;

import java.util.*;
public class stone_on_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int count = 0;
        int tot = 0;
        int dup = s.charAt(0);
        for(int i=1;i<n;i++){
            if(s.charAt(i) == dup){
                count++;
            }else{
                tot += count;
                count = 0;
                dup = s.charAt(i);
            }
        }
        tot += count;
        System.out.println(tot);
    }
}
