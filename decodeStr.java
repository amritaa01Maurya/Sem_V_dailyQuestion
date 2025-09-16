package dailyquestions;

import java.util.Stack;

public class decodeStr {
    public static String decodeString(String s) {
        // code here
        Stack<String> strSt = new Stack<>();
        Stack<Integer> numSt = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int num = 0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                num  = num * 10 + (ch - '0');
            }
            else if (ch == '['){
                numSt.push(num);
                strSt.push(curr.toString());
                num = 0;
                curr = new StringBuilder();
                
            }else if (ch == ']'){
                int times = numSt.pop();
                StringBuilder temp = new StringBuilder(strSt.pop());
                while(times-- > 0){
                    temp.append(curr);
                }
                curr = temp;
            }else{
                curr.append(ch);
            }
        }
        return curr.toString();
    }
    public static void main(String[] args) {
        String s = "3[b2[ca]]";
        System.out.println(decodeString(s));
    }
}
