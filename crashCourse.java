package dailyquestions;
import java.io.*;
import java.util.*;

public class crashCourse {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        StringBuilder out = new StringBuilder();

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            String S = br.readLine().trim();

            int leftmostA = -1;
            int rightmostB = -1;

            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == 'A') {
                    leftmostA = i;
                    break;
                }
            }

            for (int i = N - 1; i >= 0; i--) {
                if (S.charAt(i) == 'B') {
                    rightmostB = i;
                    break;
                }
            }

            String winner;
            if (leftmostA == -1) {
                winner = "Bob";
            } else if (rightmostB == -1) {
                winner = "Alice";
            } else if (leftmostA > rightmostB) {
                winner = "Alice";
            } else {
                int countA = 0;
                int countB = 0;
                for (int i = leftmostA; i <= rightmostB; i++) {
                    if (S.charAt(i) == 'A') {
                        countA++;
                    } else {
                        countB++;
                    }
                }
                
                if (countA > countB) {
                    winner = "Alice";
                } else {
                    winner = "Bob";
                }
            }
            
            out.append("Case #").append(t).append(": ").append(winner).append("\n");
        }

        System.out.print(out.toString());
    }
}