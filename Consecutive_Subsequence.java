package dailyquestions;

import java.util.*;
public class Consecutive_Subsequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer, Integer> dp = new HashMap<>();
        int maxLen = 0;
        int maxVal = 0;
        for(int i=0;i<n;i++){
            int len = dp.getOrDefault(arr[i] - 1, 0) + 1;
            
            dp.put(arr[i], len);
            
            if(len > maxLen){
                maxLen = len;
                maxVal = arr[i];
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        int val = maxVal;
        for(int i=n-1;i>=0 && val > maxVal - maxLen; i--){
            if(arr[i] == val){
                ans.add(i+1);
                val--;
            }
        }
        Collections.reverse(ans);
        System.out.println(ans.size());
        for(int a: ans){
            System.out.print(a + " ");
        }
    }
}
