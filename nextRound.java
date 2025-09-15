package dailyquestions;

import java.util.*;
public class nextRound {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int reqScore = 1;
        int[] nums = new int[n];
        for(int i =0; i < n;i++){
            nums[i] = sc.nextInt();
            if(i == k - 1 && nums[i] > 0){
                reqScore = nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i] >= reqScore){
                count++;
            }
        }
        System.out.println(count);
    }
   
}
