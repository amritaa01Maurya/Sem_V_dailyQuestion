package dailyquestions;

import java.util.Scanner;

public class fruits_basket_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] fruits = new int[n];
            for (int i = 0; i < fruits.length; i++) {
                fruits[i] = sc.nextInt();
            }
            int[] baskets = new int[n];
            for (int i = 0; i < baskets.length; i++) {
                baskets[i] = sc.nextInt();
            }
            System.out.println(numOfUnplacedFruits(fruits,baskets));
        }
    }
    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        boolean[] isFull = new boolean[n];
        int i=0;        
        int placedFruits = 0;
        while(i<n){
            for(int j=0;j<n;j++){
            if(!isFull[j] && fruits[i]<= baskets[j] ){
                isFull[j]=true;
                placedFruits++;
                break;
            }
            }
            i++;
        }
        return n - placedFruits;
    }
}
