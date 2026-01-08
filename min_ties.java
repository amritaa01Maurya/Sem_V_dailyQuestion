package dailyquestions;

import java.util.Scanner;

public class min_ties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){ 
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            if(n % 2 == 0){
                for(int i=0;i<n;i++){
                    for(int j=i+1;j<n;j++){
                       if((j-i) <= (n-2)/2){
                            sb.append("1 ");
                       }else if((j-i) == (n/2)){
                            sb.append("0 ");
                       }else{
                            sb.append("-1 ");
                       }
                    }
                }
            }else{
                for(int i=0;i<n;i++){
                    for(int j=i+1;j<n;j++){
                       if((j-i) <= (n-1)/2){
                            sb.append("1 ");
                       }else{
                            sb.append("-1 ");
                       }
                    }
                }
            }
            System.out.println(sb.toString().trim());
        }
    }
}
