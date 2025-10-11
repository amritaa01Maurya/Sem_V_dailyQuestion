package dailyquestions;

public class Longest_Fibonacci_Subarray {
    public static int longestSubarray(int[] nums) {
        if(nums.length <=2){
            return nums.length;
        }
        int maxLen = 2;
        int minLen = 2;
        for(int r=2;r<nums.length;r++){
            if(nums[r] == nums[r-1]+ nums[r-2]){
                minLen++;
                maxLen = Math.max( minLen, maxLen);
            }
            else{
                minLen = 2;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,2,3,5,1};
        System.out.println(longestSubarray(nums));
    }
}
