package dailyquestions;

import java.util.*;

class ExamTracker {
    private List<Integer> timePeriod;
    private List<Long> prefix;
    public ExamTracker() {
       timePeriod = new ArrayList<>();
       prefix = new ArrayList<>();
    }
    
    public void record(int time, int score) {
        timePeriod.add(time);
        long sum = 0;
        if(prefix.size() > 0){
            sum = prefix.get(prefix.size() - 1);
        }

        prefix.add(score + sum);
    }
    
    private int lowerBound(List<Integer> ll, int startTime) {
        int l = 0;
        int r = ll.size() - 1;
        int ans = ll.size();
        while(l <= r){
            int mid = l + ( r - l)/2;
            if(ll.get(mid) >= startTime){
                ans = mid;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return ans;
    }
    private int upperBound(List<Integer> ll, int endTime) {
        int l = 0;
        int r = ll.size() - 1;
        int ans = -1;
        while(l <= r){
            int mid = l + ( r - l)/2;
            if(ll.get(mid) <= endTime){
                ans = mid;
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return ans;
    }
    public long totalScore(int startTime, int endTime) {
        int l = lowerBound(timePeriod, startTime);
        int r = upperBound(timePeriod, endTime);
        if( l > r) return 0;
        long rsum = prefix.get(r);
        long lsum = (l == 0) ? 0 : prefix.get(l-1);
        return rsum - lsum;
    }
}

public class exam_score_tracker {
    public static void main(String[] args) {
        ExamTracker tracker = new ExamTracker();
        tracker.record(1, 98);
        System.out.println(tracker.totalScore(1, 1)); // 98
        // System.out.println(tracker.totalScore(1, 1)); // 98
        tracker.record(5, 99);
        System.out.println(tracker.totalScore(1, 3)); // 98
        System.out.println(tracker.totalScore(1, 5)); // 197
        System.out.println(tracker.totalScore(3, 4)); // 0
        System.out.println(tracker.totalScore(2, 5)); // 99
    }
}


