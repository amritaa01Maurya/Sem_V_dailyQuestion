package dailyquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Maximal_Rank {

    public static int maxNetworkRank(List<Integer> starts, List<Integer> ends, int n) {
        // WRITE YOUR BRILLIANT CODE HERE
        int[] count = new int[n];
        for(int i=0;i<ends.size();i++){
            count[starts.get(i) - 1]++;
            count[ends.get(i) - 1]++;
        }
        int maxRank = 0;
        for(int i=0;i<ends.size();i++){
            int rank = count[starts.get(i) - 1] + count[ends.get(i) - 1] - 1;
            if(rank > maxRank){
                maxRank = rank;
            }
        }
        return maxRank;
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> starts = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> ends = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();
        int res = maxNetworkRank(starts, ends, n);
        System.out.println(res);
    }

}
