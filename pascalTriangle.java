package dailyquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class pascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt();
        List<List<Integer>> pascelTri = new ArrayList<>();
        pascelTri.addAll(generate(numRows));
        for (int i = 0; i < pascelTri.size(); i++) {
            System.out.println(pascelTri.get(i));  
        }
    }

    public static List<List<Integer>> generate(int nR) {
        if(nR==0) return new ArrayList<>();
        if(nR==1){
            List<List<Integer>> res = new ArrayList<>();
            res.add(Arrays.asList(1));
            return res;
        }
        List<List<Integer>> pR =generate(nR-1);
        List<Integer> newR = new ArrayList<>();
        for(int i = 0; i<nR;i++){
            newR.add(1);
        }
         for(int i = 1; i<nR-1;i++){
            newR.set(i, pR.get(nR-2).get(i-1)+pR.get(nR-2).get(i));

        }
        pR.add(newR);
        return pR;
        
    }
}
