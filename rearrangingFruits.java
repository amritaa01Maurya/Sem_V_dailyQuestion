package dailyquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class rearrangingFruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] basket1 = new int[n];
            for (int i = 0; i < basket1.length; i++) {
                basket1[i] = sc.nextInt();
            }
            int[] basket2 = new int[n];
            for (int i = 0; i < basket2.length; i++) {
                basket2[i] = sc.nextInt();
            }
            System.out.println(minCost(basket1,basket2));
    }
}

    public static long minCost(int[] basket1, int[] basket2) {
        Map<Integer, Integer> freq1 = new HashMap<>();
        int minele = Integer.MAX_VALUE;
        for(int b: basket1){
            freq1.put(b, freq1.getOrDefault(b,0)+1);
            minele = Math.min(minele,b);
        }
        for(int b: basket2){
            freq1.put(b, freq1.getOrDefault(b,0)-1);
            minele = Math.min(minele,b);
        }

        List<Integer> l = new ArrayList<>();
        for(Map.Entry<Integer, Integer> e:freq1.entrySet()){
            int cost = e.getKey();
            int count = Math.abs(e.getValue());
            if(count % 2 != 0) {
                return -1;
            }
            if(e.getValue()!=0){
                for(int i=1; i <= count/2;i++){
                    l.add(cost);
                }
            }
        }
        Collections.sort(l);
        long mincost = 0;
        for(int i=0; i < l.size()/2;i++){
            mincost += Math.min(l.get(i),minele*2);
        }
        return mincost;
    }
}
