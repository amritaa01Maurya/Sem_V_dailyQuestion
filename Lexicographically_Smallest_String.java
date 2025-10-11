package dailyquestions;

import java.util.Scanner;
public class Lexicographically_Smallest_String {
    
    public static String smallestString(String s) {
        // WRITE YOUR BRILLIANT CODE HERE
        int point = 0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) > s.charAt(i+1)){
                point = i;
                break;
            }
        }
        return s.substring(0,point) + s.substring(point+1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        String res = smallestString(s);
        System.out.println(res);
    }

}
