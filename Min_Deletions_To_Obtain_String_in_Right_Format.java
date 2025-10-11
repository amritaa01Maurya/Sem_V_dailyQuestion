package dailyquestions;

import java.util.Scanner;
public class Min_Deletions_To_Obtain_String_in_Right_Format {
// 
    public static int minStep(String s) {
        // WRITE YOUR BRILLIANT CODE HERE
        int cy = 0;
        int del = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'X'){
                del = Math.min(del + 1, cy);
            }else{
                cy++;
            }
        }
        return del;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        int res = minStep(s);
        System.out.println(res);
    }

}
