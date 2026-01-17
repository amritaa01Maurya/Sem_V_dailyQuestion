package dailyquestions;

import java.util.Scanner;

public class goldman_OA {
    /*
    Problem Statement: A cybersecurity firm is developing a tool to analyze patterns in encrypted text data streams that use a modified Caesar cipher based on a circular English alphabet. This cipher loops continuously through the alphabet (a to z and back to a), and encrypted messages often contain fragments of this wraparound pattern.
To help the system identify known patterns or anomalies, engineers need to detect which parts of a given string are valid continuous segments within this infinite wraparound sequence. For example, valid substrings include "abc", "xyz", and "zab", as they appear in order in the repeating alphabet loop.
The input string s represents a captured segment of encrypted traffic. Your task is to develop an algorithm that finds the number of unique non-empty substrings of s that are valid continuous segments in the infinite wraparound string defined as repeated sequences of "abcdefghijklmnopqrstuvwxyz".
For instance, if the input is "zab", all of its substrings—"z", "a", "b", "za", "ab", "zab"—are part of the infinite wraparound string, and should be counted if they form valid continuous segments.
This functionality will be integrated into a pattern-detection engine that searches for signs of repeated attack signatures or familiar sequences in large encrypted datasets. Accurately identifying wraparound substrings is essential for flagging known cipher behaviors and preventing false negatives in the detection process.
Given a string s, return the number of unique non-empty substrings of s that exist in the infinite wraparound string formed by repeating "abcdefghijklmnopqrstuvwxyz" endlessly.
This assessment evaluates a candidate’s ability to handle substring generation, implement efficient search and pattern recognition algorithms, and understand cyclic data structures—all relevant to cybersecurity, cryptography, and real-time data analysis systems.

Constraints:
1 <= s.length <= 10^5
s consists of lowercase English letters.

Example 1:
Input: s = "a"
Output: 1
Explanation: Only the substring "a" of s is in base.

Example 2:
Input: s = "cac"
Output: 2
Explanation: There are two substrings ("a", "c") of s in base.

Example 3:
Input: s = "zab"
Output: 6
Explanation: There are six substrings ("z", "a", "b", "za", "ab", and "zab") of s in base.



Input0:
abc
Output0:
6
Input1:
mnl
Output1:
4
Input2:
adefv
Output2:
8
Input3:
asder
Output3:
6
Input4:
asdertu
Output4:
9
Input5:
cabde
Output5:
7
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = 1;
        int validsubstring = 1;
        for (int i = 1; i < s.length(); i++) {
            if((s.charAt(i) - s.charAt(i-1) + 26) % 26 == 1){
                len++;
            }else{
                len = 1;
            }
            validsubstring += len;
        }
        System.out.println(validsubstring);
    }
}
