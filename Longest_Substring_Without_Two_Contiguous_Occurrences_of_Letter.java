package dailyquestions;

import java.util.Scanner;


public class Longest_Substring_Without_Two_Contiguous_Occurrences_of_Letter {

    public static String longestValidString(String s) {
        // WRITE YOUR BRILLIANT CODE HERE
        int n = s.length();
        int l=0;
        int st = 0;
        int count = 0;
        int maxLen = 0;
        for(int r=1;r<n;r++){
            if(s.charAt(r) == s.charAt(r -1)){
                count++;
            }else{
                count = 1;
            }
            if(count <= 2){
                if(r - l + 1 > maxLen){
                    maxLen = r - l + 1;
                    st = l;
                }
            }else{
                l = r - 1;
                count = 2;
            }
        }
        return s.substring(st, st + maxLen);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        String res = longestValidString(s);
        System.out.println(res);
    }
}

