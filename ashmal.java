package dailyquestions;

import java.util.Scanner;

public class ashmal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String[] arr = new String[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.next();
            }
            StringBuilder s = new StringBuilder();
            for(int i=0;i<n;i++){
                String beg = arr[i] + s;
                String end = s + arr[i];

                if(beg.compareTo(end) < 0){
                    s.insert( 0, arr[i]);
                }else{
                    s.append(arr[i]);
                }
            }
            System.out.println(s);
        }
    }
}
