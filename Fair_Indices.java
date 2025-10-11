package dailyquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Fair_Indices {
    public static int fairIndexes(List<Integer> a, List<Integer> b) {
        int totSumA = 0;
        int totSumB = 0;

        for (int i = 0; i < a.size(); i++) {
            totSumA += a.get(i);
            totSumB += b.get(i);
        }
        int count = 0;
        int tempA = a.get(0);
        int tempB = b.get(0);

        for (int i = 1; i < a.size(); i++) {
            if (i != 1 && tempA == tempB && 2 * tempA == totSumA && 2 * tempB == totSumB) {
                count++;
            }
            tempA += a.get(i);
            tempB += b.get(i);
        }
        return count;
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> a = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> b = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        scanner.close();
        int res = fairIndexes(a, b);
        System.out.println(res);
    }
}
