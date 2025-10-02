package dailyquestions;

import java.util.*;

public class DoremyPaint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            TreeMap<Integer,Integer> map = new TreeMap<>();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                int num = sc.nextInt();
                map.put(num, map.getOrDefault(num, 0)+1);
            }
            if(map.size() > 2){
                System.out.println("NO");
            }else if(map.size() == 2){
                if(n % 2 == 0){
                    int a = map.firstKey();
                    int b = map.lastKey();
                    if(map.get(a) == map.get(b)){
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                }else{
                    int a = map.firstKey();
                    int b = map.lastKey();
                    if(map.get(a) == map.get(b) + 1 || map.get(a) == map.get(b) - 1){
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                }
            }else{
                System.out.println("YES");
            }
        }
    }
}
