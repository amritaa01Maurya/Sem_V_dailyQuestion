package dailyquestions;

import java.util.Stack;

public class countOfsubmatrix {
    class Solution {
    public int countOfSubmat(int[] height) {
        int n = height.length;
        Stack<Integer> st = new Stack();
        int[]  submat = new int[n];
        int submatCnt = 0;
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && height[st.peek()] >= height[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                int idx = st.peek();
                submat[i] = submat[idx] + height[i] * (i - idx);
            }else{
                submat[i] = height[i] * (i + 1);
            }
            st.push(i);
            submatCnt += submat[i];
        }
        return submatCnt;
    }
    public int numSubmat(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] height = new int[m];
        int submatCount = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(mat[i][j] == 0){
                    height[j] = 0;
                }else{
                    height[j] += 1;
                }
            }
            submatCount += countOfSubmat(height);
        }
        return submatCount;
    }
}
    public static void main(String[] args) {
        
    }
    
}
