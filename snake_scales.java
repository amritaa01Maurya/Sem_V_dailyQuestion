package dailyquestions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class snake_scales {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine().trim());

        StringBuilder out = new StringBuilder();

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            int[] A = new int[N];

            int idx = 0;
            while (idx < N) {
                st = new StringTokenizer(br.readLine());
                while (st.hasMoreTokens()) {
                    A[idx++] = Integer.parseInt(st.nextToken());
                }
            }

            int maxDiff = 0;
            for (int i = 0; i < N - 1; i++) {
                maxDiff = Math.max(maxDiff, Math.abs(A[i] - A[i + 1]));
            }

            out.append("Case #").append(t).append(": ").append(maxDiff).append("\n");
        }

        System.out.print(out.toString());
    }

}
