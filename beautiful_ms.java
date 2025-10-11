package dailyquestions;

import java.util.*;

public class beautiful_ms {
    public static int solve(String sb) {
        StringBuilder s = new StringBuilder(sb);
        int i=0;
        int count = 0;
        while(i < s.length() - 1){
            if(s.charAt(i)==s.charAt(i+1) || Math.abs((s.charAt(i) -'a') - (s.charAt(i+1)-'a')) == 1){
                count++;
                s.setCharAt(i+1, '*');
            }
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        // String s = "abdde";
        // String s = "bcbbe";
        String s = "aaabcde";
        System.out.println(solve(s));
    }
}
