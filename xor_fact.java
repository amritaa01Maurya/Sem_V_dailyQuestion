package dailyquestions;

import java.util.Scanner;

public class xor_fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (k % 2 != 0) {
                for (int i = 0; i < k; i++) {
                    System.out.print(n + (i == k - 1 ? "" : " "));
                }
            } else {
                for (int i = 0; i < k - 1; i++) {
                    System.out.print(n + " ");
                }
                System.out.print(0);
            }
            System.out.println();
        }
    }
}
