package dailyquestions;

import java.util.*;

public class mysterious_gift {
    static class Envelope{
        int a;
        int b;
        int id;
        public Envelope(int a, int b, int id){
            this.a = a;
            this.b = b;
            this.id = id;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] card = new int[2];
        for(int i=0;i<2;i++){
            card[i] = sc.nextInt();  
        }

        List<Envelope> env = new ArrayList<>();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a > card[0] && b > card[1]){
                env.add(new Envelope(a, b, i + 1));
            }
        }

        if(env.size() == 0){
            System.out.println(0);
            return;
        }

        env.sort(new Comparator<Envelope>() {
            @Override
            public int compare(Envelope a, Envelope b) {
                if(a.a == b.a) return b.b - a.b;
                return a.a - b.a;
            }
        });

        n = env.size();
        int[] dp = new int[n];
        int[] par = new int[n];
        Arrays.fill(par, -1);

        Arrays.fill(dp, 1);
        int maxLen = 1;
        int idx = 0;
        for(int i=1;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(env.get(i).b > env.get(j).b && env.get(i).a > env.get(j).a){
                    if(dp[j] + 1 > dp[i]){
                        dp[i] = dp[j] + 1;
                        par[i] = j;
                    }
                }
            }
            if(dp[i] > maxLen){
                maxLen = dp[i];
                idx = i;
            }
        }
        
        System.out.println(maxLen);
        List<Integer> res = new ArrayList<>();
        while(idx != -1){
            res.add(env.get(idx).id);
            idx = par[idx];
        }
        Collections.reverse(res);
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i) + (i == res.size() - 1 ? "\n" : " "));
        }
    }
}
