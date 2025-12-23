import java.util.Arrays;
import java.util.Scanner;

public class SimplePoker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int n = 0; n < N; n++) {
            // Read Input
            int[] inputs = new int[5];
            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = sc.nextInt();
            }

            // Make stats
            int[] stats = new int[10];
            for (int i = 0; i < inputs.length; i++) {
                stats[inputs[i]]++;
            }

            // System.out.println(Arrays.toString(stats));

            // find max stats
            int max = 0;
            int argmax = -1;
            for (int i = 0; i < stats.length; i++) {
                if (stats[i] > max) {
                    max = stats[i];
                    argmax = i;
                }
            }

            // System.out.println("max: " + max);

            if (max == 1) {
                System.out.println("No Combination");
            } else if (max == 4) {
                System.out.println("Four of a Kind of " + argmax);
            } else if (max == 3) {
                System.out.println("Triple of " + argmax);
            } else if (max == 2) {
                
                // find pair
                int pair1 = -1;
                int pair2 = -1;
                for (int i = 0; i < inputs.length; i++) {
                    if (stats[inputs[i]] == 2) {
                        if (inputs[i] == pair1) {
                            continue;
                        }
                        if (pair1 == -1) {
                            pair1 = inputs[i];
                        } else {
                            pair2 = inputs[i];
                        }
                    }
                }
                if (pair2 == -1) {
                    System.out.println("One Pair of " + pair1);
                } else {
                    System.out.println("Two Pair of " + pair1 + " and " + pair2);
                }
            }
        }

    }
}