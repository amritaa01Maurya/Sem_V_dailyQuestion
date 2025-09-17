package dailyquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class nextGreaterCir {
    public static ArrayList<Integer> nextGreater(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, -1));
        for(int i= 2 * arr.length - 1; i>=0;i--){
            int idx = i%n;
            int curr = arr[idx];
            while(!st.isEmpty() && st.peek() <= curr){
                st.pop();
            }
            if(i < n){
                if(!st.isEmpty()){
                    ans.set(idx,st.peek());
                }
            }
            st.push(curr);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
        System.out.println(nextGreater(arr));
    }
}
