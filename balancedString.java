package dailyquestions;

import java.util.Scanner;

public class balancedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            boolean f = false;
            char[] arr = sc.next().toCharArray();
            for (int i = k; i < arr.length; i++) {
                if(arr[i] == '1'){
                    if(arr[i%k] == '0'){
                        f = true;
                    }else{
                        arr[i%k] = '1';
                    }
                }else if(arr[i] == '0'){
                    if(arr[i%k] == '1'){
                        f = true;
                    }else{
                        arr[i%k] = '0';
                    }
                }
            }
            if(f){
                System.out.println("NO");
            }else{
                int count_1 = 0;
                int count_0 = 0;
                for (int i = 0; i < k; i++) {
                    if(arr[i] == '0'){
                        count_0++;
                    }else if(arr[i] == '1'){
                        count_1++;
                    }
                }
                if(count_0 > k/2 || count_1 > k/2){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }
        }
    }
}
