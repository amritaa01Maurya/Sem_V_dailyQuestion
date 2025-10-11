package dailyquestions;

import java.util.Scanner;
public class String_Without_3_Identical_Consecutive_Letters {
// 
    public static String filterString(String s) {
        // WRITE YOUR BRILLIANT CODE HERE
        StringBuilder sb = new StringBuilder(s);
        int count = 1;
        char ch = sb.charAt(0);
        for(int i=1;i<sb.length();){
            if(sb.charAt(i) == ch){
                count++;
            }else{
                ch = sb.charAt(i);
                count = 1;
            }
            if(count >= 3){
                count--;
                sb.deleteCharAt(i);
            }else{
                i++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        String res = filterString(s);
        System.out.println(res);
    }

}
