package dailyquestions;

import java.util.HashMap;
import java.util.Scanner;


public class fruit_basket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] fruits = new int[n];
            for (int i = 0; i < fruits.length; i++) {
                fruits[i] = sc.nextInt();
            }
            System.out.println(totalFruit(fruits));
        }
    }
    public static int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = fruits.length;
        int l = 0;
        int maxFruits = 0;
        int ans = 0;
        for(int r=0;r<n;++r){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            maxFruits++;
            while(map.size() > 2){
                maxFruits--;
                map.put(fruits[l],map.get(fruits[l])-1);
                if(map.get(fruits[l])==0){
                    map.remove(fruits[l]);
                }
                l++;
            }
            ans = Math.max(ans,maxFruits);
        }
        return ans;
    }
}
