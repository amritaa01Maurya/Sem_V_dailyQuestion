package dailyquestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class substrWithConc {
    class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int wordLen = words[0].length();
        int totWords = words.length;
        int totLen = wordLen * totWords;
        Map<String, Integer> wordCount = new HashMap<>();
        for(String st: words){
            wordCount.put(st, wordCount.getOrDefault(st, 0)+1);
        }
        List<Integer> indices = new ArrayList<>();
        for(int i=0;i<wordLen;i++){
            int l = i;
            int r = i;
            Map<String, Integer> found = new HashMap<>();
            while(r + wordLen <= s.length()){
                String rword = s.substring(r, r + wordLen);
                r += wordLen;

                if(wordCount.containsKey(rword)){
                    found.put(rword, found.getOrDefault(rword, 0)+1);

                    while(found.get(rword) > wordCount.get(rword)){
                        String lword = s.substring(l, l + wordLen);
                        l += wordLen;
                        found.put(lword, found.get(lword)-1);
                    }

                    if(r - l== totLen){
                        indices.add(l);
                    }
                }else{
                    found.clear();
                    l = r;
                }
            }
        }
        return indices;
    }
}
}
