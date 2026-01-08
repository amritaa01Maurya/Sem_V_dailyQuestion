package dailyquestions;

import java.util.Scanner;

public class frog_jump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int maxJump = 0;
            int prevPosR = -1;
            for(int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'R') {
                    maxJump = Math.max(maxJump, i - prevPosR);
                    prevPosR = i;
                }
            }
            maxJump = Math.max(maxJump, s.length() - prevPosR); 
            System.out.println(maxJump);
        }
    }
}
