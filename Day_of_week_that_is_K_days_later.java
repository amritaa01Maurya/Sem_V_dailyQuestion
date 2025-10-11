package dailyquestions;

import java.util.List;
import java.util.Scanner;

public class Day_of_week_that_is_K_days_later {
// 
    public static String dayOfWeek(String day, int k) {
        List<String> days = List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        int index = days.indexOf(day);
        return days.get((index + k) % 7);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        int k = Integer.parseInt(scanner.nextLine());
        scanner.close();
        String res = dayOfWeek(day, k);
        System.out.println(res);
    }

}
