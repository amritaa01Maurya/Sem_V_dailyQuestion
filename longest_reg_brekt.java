package dailyquestions;

import java.util.Scanner;
import java.util.Stack;

public class longest_reg_brekt {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        int last = -1;
        int maxLen = 0;
        int count = 1;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(i);
            }else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                    continue;
                }
                last = st.peek();
                int len = i - last;
                if(len > maxLen){
                    maxLen = len;
                    count = 1;
                }else if(len == maxLen){
                    count++;
                }
            }
        }
        System.out.println(maxLen + " " + count);
    }
}
