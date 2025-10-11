package dailyquestions;

import java.util.*;

public class palindrome_pair_ms {
    public static boolean isPalindrome(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch: s1.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(char ch: s2.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int odd = 0;
        for(Character key: map.keySet()){
            if(map.get(key) % 2 == 1){
                odd++;
            }
        }
        return odd > 1 ? false: true;
    }
    public static int pair(String[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(isPalindrome(arr[i], arr[j])){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String[] arr = {"ball", "all", "call", "bal"};
        System.out.println(pair(arr));
    }
}
