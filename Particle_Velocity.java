package dailyquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Particle_Velocity {
// 
    public static int particleVelocity(List<Integer> particles) {
        // WRITE YOUR BRILLIANT CODE HERE
        int n = particles.size();
        int tot_time = 0;
        
        for(int i=0;i<n;i++){
            int period = 0;
            for(;i + 2 < n && particles.get(i) - particles.get(i+1) == particles.get(i+1) - particles.get(i+2);i++){
                period++;
                tot_time += period;
            }
        }
        return tot_time == 1000000000? -1 : tot_time;
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> particles = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        scanner.close();
        int res = particleVelocity(particles);
        System.out.println(res);
    }

}
