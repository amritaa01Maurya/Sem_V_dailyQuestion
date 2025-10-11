package dailyquestions;

import java.util.Scanner;
public class Max_Inserts_to_Obtain_String_Without_3_Consecutive_a {
    // 
    public static int maxInserts(String s) {
        // WRITE YOUR BRILLIANT CODE HERE
        int count_A = 0;
        int count = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i) == 'a'){
                count_A++;
            }else{
                count_A = 0;
                count++;
            }
            if(count_A == 3){
                return -1;
            }
        }
        int ans = (count + 1) * 2 - (n - count);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        int res = maxInserts(s);
        System.out.println(res);
    }

}
