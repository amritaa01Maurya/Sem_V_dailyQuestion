package dailyquestions;

public class Longest_Non_Decreasing_Subarray_After_Replacing_at_Most_One_Element {

    public static int longestSubarray(int[] nums) {
        int n = nums.length;
        int[] st = new int[n];
        st[n-1]=1;
        for(int i=n-2;i>=0;i--){
            if(nums[i] <= nums[i+1]){
                st[i] = st[i+1] +1;
            }else{
                st[i] = 1;
            }
        }
        int[] end = new int[n];
        end[0]=1;
        int len = 1;
        for(int i=1;i<n;i++){
            if(nums[i] >= nums[i-1]){
                end[i] = end[i-1] +1;
            }else{
                end[i] = 1;
            }
            len = Math.max(len, end[i]);
        }
        for(int i=0;i<n;i++){
            int l = i == 0 ? 0 : end[i-1];
            int r = i == n-1 ? 0 : st[i+1];
            
            long prev = i == 0 ? Long.MIN_VALUE : nums[i-1];
            long next = i == n-1 ? Long.MAX_VALUE  : nums[i+1];

            len = Math.max(len, Math.max(l, r) + 1);

            if(prev <= next){
                len = Math.max(len, l + r + 1);
            }
             
        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2};
        int ans = longestSubarray(arr);
        System.out.println(ans);
    }

}
