package dailyquestions;

import java.util.*;

public class mocha_hiking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            List<Integer> path = new ArrayList<>();
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                path.add(i+1);
            }
            boolean found = false;
            for(int i=0;i<n-1;i++){
                if(!found &&arr[i]== 0 && arr[i+1]==1){
                    found = true;
                    path.add(i+1,n+1);
                    break;
                }
            }
            if(!found){
                if(arr[0]==1){
                    path.add(0,n+1);
                }else if(arr[n-1]==0){
                    path.add(n+1);
                }else{
                    System.out.println(-1);
                    continue;
                }
            }
            for(int i=0;i<path.size();i++){
                System.out.print(path.get(i)+" ");
            }
            System.out.println();
        }
    }
}
