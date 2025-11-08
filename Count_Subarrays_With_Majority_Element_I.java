package dailyquestions;

public class Count_Subarrays_With_Majority_Element_I {

    public static int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=i;j<n;j++){
                if(nums[j] == target){
                    count++;
                }
                if(count * 2 > (j - i + 1)){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,2,3};
        int target = 2;
        System.out.println(countMajoritySubarrays(arr, target));

    }

}