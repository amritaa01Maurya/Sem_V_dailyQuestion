package dailyquestions;

import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;
    
public class Unique_Integers_That_Sum_Up_To_0 {
    public static List<Integer> uniqueSum(int n) {
        // WRITE YOUR BRILLIANT CODE HERE
        int k = -n + 1;
        List<Integer> l= new ArrayList<>();
        while(k <= n - 1){
            if(k == 0){
                if(n % 2 != 0){
                    l.add(k);
                }
            }else{
                l.add(k);
            }
            k += 2;
        }
        return l;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();
        List<Integer> res = uniqueSum(n);
        System.out.println(res.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
