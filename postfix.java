package dailyquestions;

import java.util.Stack;

public class postfix {
    public static int evaluatePostfix(String[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        for(String s: arr){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("^")){
                int b = st.pop();
                int a = st.pop();
                if(s.equals("*")){
                    st.push(a*b);
                }else if(s.equals("+")){
                    st.push(a+b);
                }else if(s.equals("-")){
                    st.push(a-b);
                }else if(s.equals("^")){
                    st.push((int)Math.pow(a,b));
                }else{
                    st.push((int)Math.floor((double)a/b));
                }
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        String[] arr = {"2", "3", "1", "*", "+", "9", "-"};
        System.out.println(evaluatePostfix(arr));
    }

}
