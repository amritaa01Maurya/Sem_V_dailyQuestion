package dailyquestions;
import java.io.*;
import java.util.*;

public class finalProduct {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine().trim());

        StringBuilder out = new StringBuilder();

        for (int t = 1; t <= T; t++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            int prod1 = -1;
            int prod2 = -1;
            
            for (int d = 1; d <= A; d++) {
                if (B % d == 0) {
                    prod1 = d;
                    prod2 = B / d;
                    break;  
                }
            }
            
            int[] M = new int[2 * N];
            
            M[0] = prod1;
            for (int i = 1; i < N; i++) {
                M[i] = 1;
            }
            
            M[N] = prod2;
            for (int i = N + 1; i < 2 * N; i++) {
                M[i] = 1;
            }
            
            out.append("Case #").append(t).append(": ");
            for (int i = 0; i < 2 * N; i++) {
                out.append(M[i]);
                if (i < 2 * N - 1) {
                    out.append(" ");
                }
            }
            out.append("\n");
        }

        // Print the entire collected output at once
        System.out.print(out.toString());
    }
}