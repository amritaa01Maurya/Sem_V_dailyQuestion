package dailyquestions;

import java.util.*;
public class warmUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int test = 1; test <= t; test++) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];

            for (int i = 0; i < N; i++) A[i] = sc.nextInt();
            for (int i = 0; i < N; i++) B[i] = sc.nextInt();

            List<int[]> ops = solve(N, A, B);

            if (ops == null) {
                System.out.println("Case #" + test + ": -1");
            } else {
                System.out.println("Case #" + test + ": " + ops.size());
                for (int[] op : ops) {
                    System.out.println(op[0] + " " + op[1]);
                }
            }
        }
    }

    private static List<int[]> solve(int N, int[] A, int[] B) {
        Map<Integer, Integer> map = new HashMap<>();
        List<int[]> ops = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            if (A[i] > B[i]) return null;
        }

        for (int i = 0; i < N; i++) {
            map.put(A[i], i);
        }

        for (int i = 0; i < N; i++) {
            if (A[i] != B[i]) {
                if(!map.containsKey(B[i])) return null;
                int j = map.get(B[i]); 
                ops.add(new int[]{j + 1, i + 1});
            }
        }
        return ops;
    }

}
