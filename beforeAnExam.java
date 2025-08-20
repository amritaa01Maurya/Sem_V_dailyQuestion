package dailyquestions;

import java.util.Scanner;

public class beforeAnExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int sumTime = sc.nextInt();
        int[] minTime = new int[d];
        int[] maxTime = new int[d];
        int minSum = 0;
        int maxSum = 0;
        for (int i = 0; i < d; i++) {
            minTime[i] = sc.nextInt();
            maxTime[i] = sc.nextInt();
            minSum += minTime[i];
            maxSum += maxTime[i];
        }
        if(sumTime < minSum || sumTime > maxSum){
            System.out.println("NO");
        }else{
            System.out.println("YES");
            int[] schedule = new int[d];
            for (int i = 0; i < d; i++) {
                schedule[i] = minTime[i];
            }
            int leftTime = sumTime - minSum;
            for (int i = 0; i < schedule.length; i++) {
                schedule[i] += Math.min((maxTime[i]-minTime[i]), leftTime);
                leftTime -= Math.min((maxTime[i]-minTime[i]), leftTime);
            }

            for (int i = 0; i < schedule.length; i++) {
                System.out.print(schedule[i]+" ");
            }
            System.out.println();
        }
    }
}
