package dailyquestions;

public class Equal_Score_Substrings {
    public static boolean scoreBalance(String s) {
        int tot = 0;
        for(char ch: s.toCharArray()){
            tot += (ch - 'a' + 1);
        }
        int leftSum = 0;
        for(int i=0;i<s.length() - 1;i++){
            char ch = s.charAt(i);
            leftSum += (ch - 'a' + 1);
            if(leftSum  == tot - leftSum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "adcb";
        System.out.println(scoreBalance(s));
    }
}
