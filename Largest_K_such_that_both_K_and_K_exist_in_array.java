package dailyquestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest_K_such_that_both_K_and_K_exist_in_array {
    // Max_Inserts_to_Obtain_String_Without_3_Consecutive_a
    public static int largestK(List<Integer> nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        for (int a : nums) {
            if (set.contains(-a))
                max = Math.max(max, Math.abs(a));
            else
                set.add(a);
        }
        return max;
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        scanner.close();
        int res = largestK(nums);
        System.out.println(res);
    }
}
