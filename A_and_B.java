package dailyquestions;
import java.util.*;
public class A_and_B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();

            List<Integer> aPos = new ArrayList<>();
            List<Integer> bPos = new ArrayList<>();

            for(int i = 0; i < n; i++) {
                if(s.charAt(i) == 'a') {
                    aPos.add(i);
                } else {
                    bPos.add(i);
                }
            }

            long movesA = minMove(aPos);
            long movesB = minMove(bPos);

            System.out.println(Math.min(movesA, movesB));
        }
    }

    private static long minMove(List<Integer> l) {
        int len = l.size();
        if (len <= 1) return 0;

        int medianIndex = len / 2;
        int medianValue = l.get(medianIndex);

        long moves = 0;
        for (int i = 0; i < len; i++) {
            int targetPos = medianValue - medianIndex + i;
            moves += Math.abs(l.get(i) - targetPos);
        }

        return moves;
    }
}
