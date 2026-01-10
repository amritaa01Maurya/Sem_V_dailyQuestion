package dailyquestions;

import java.util.Scanner;

public class string_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' || s.charAt(i)=='Y' || s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='y'){
                continue;
            }else{
                sb.append(".");
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        System.out.println(sb.toString());  
    }
}
