package dailyquestions;

public class Minimum_Moves_to_Equal_Array_Elements_III {

    public static int minMoves(int[] nums) {
        int max = 0;
        for(int num:nums){
            max = Math.max(max, num);
        }
        int count = 0;
        for(int num: nums){
            count += (max - num);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        System.out.println(minMoves(arr));
    }

}