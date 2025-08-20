package dailyquestions;

import java.util.HashMap;
import java.util.Scanner;

public class registrationSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        HashMap<String,Integer> map = new HashMap<>();
        while(t-- > 0){
            String s = sc.next();
            if(!map.containsKey(s)){
                System.out.println("OK");
            }else{
                System.out.println(s+map.get(s));
            }
            map.put(s,map.getOrDefault(s, 0)+1);
        }
    }
}
