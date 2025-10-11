package dailyquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Maximum_Length_of_a_Concatenated_String_with_Unique_Characters {
    static int len = 0;
    public static boolean isUnique(String path) {
        char[] arr = path.toCharArray();
        if (arr != null) Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void length(List<String> arr, String path, int i) {
        if(isUnique(path)){
            len = Math.max(len, path.length());

        }
        if(i >= arr.size() || !isUnique(path)){
            return;
        }
        for(int j=i;j<arr.size();j++){
            length(arr, path + arr.get(j), j + 1);
        }
    }
    public static int maxLength(List<String> arr) {
        // WRITE YOUR BRILLIANT CODE HERE
        length(arr,"", 0);
        return len;
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> arr = splitWords(scanner.nextLine());
        scanner.close();
        int res = maxLength(arr);
        System.out.println(res);
    }

}
