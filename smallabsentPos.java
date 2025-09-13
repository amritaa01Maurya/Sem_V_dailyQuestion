package dailyquestions;

import java.util.HashSet;
import java.util.Set;

public class smallabsentPos {
    public  static int smallestAbsent(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int avg = 0;
        for(int i=0; i< nums.length;i++){
            set.add(nums[i]);
            avg += nums[i];
        }
        avg = avg/nums.length;
        int ans = 0;
        int i =  avg + 1;
        if(avg < 1){
            i = 1;
        }
        while(true){
            if(!set.contains(i)){
                return i;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        // int[] nums = {3,5};
        int[] nums = {1,-1,2};

        System.out.println(smallestAbsent(nums));
    }
    
}
