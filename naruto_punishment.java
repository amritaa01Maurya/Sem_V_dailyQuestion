package dailyquestions;

import java.util.*;
public class naruto_punishment {
    public static int lowerbound(List<Long> list, long val){
        int l = 0;
        int r = list.size()-1;
        int idx = list.size();
        while(l <= r){
            int m = (l + r)/2;
            if(list.get(m) >= val){
                r = m - 1;
                idx = m;
            }else{
                l = m + 1;
            }
        }
        return idx;
    }
    public static void getSubsetSum(long[] arr, List<Long> l, int i, int j){
        int len = j - i + 1;
        int tot = 1 << len;
        for(int m = 0;m < tot; m++){
            long sum = 0;
            for(int k=0;k<len;k++){
                if((m & (1 << k)) != 0){
                    sum += arr[i + k];
                }
            }
            l.add(sum);
        }
        return;
    }
    
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
        }
        long k = sc.nextLong();
        int mid = n/2;
        List<Long> l = new ArrayList<>();
        List<Long> r = new ArrayList<>();
        getSubsetSum(arr, l, 0, mid - 1);
        getSubsetSum(arr, r, mid, n - 1);
        Collections.sort(r);

        long count = 0;
        for(long s:l){
            int idx = lowerbound(r, k - s);
            if(idx < r.size()){
                count += (r.size() - idx);
            }
        }
        System.out.println(count);
    }
}
