import java.util.Arrays;
import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] boxes = new int[N + 1];

        // count score
        int K = sc.nextInt();
        for (int k = 0; k < K; k++) {
            int vote = sc.nextInt();
            boxes[vote]++;
            
        }

        // find Winner
        int maxScore = -1;
        int winnerId = -1;
        for (int i = 1; i < boxes.length; i++) {
            if (boxes[i] > maxScore) {
                maxScore = boxes[i];
                winnerId = i;
            }
        }

        // System.out.println("Count: " + Arrays.toString(boxes));
        // System.out.println("winnerId: " + winnerId);
        // System.out.println("maxScore: " + maxScore);
        System.out.println(winnerId);
        System.out.println(maxScore);
        
    }
}
/*
 * 
 * N = 5
 * 
 * BoxIndex: 0 1 2 3 4 5
 * Count: X 0 0 0 0 0
 * 
 * vote = 3
 * BoxIndex: 0 1 2 3 4 5
 * Count: X 0 0 1 0 0
 * 
 * 
 * vote = 2
 * BoxIndex: 0 1 2 3 4 5
 * Count: X 0 1 1 0 0
 * 
 * vote = 3
 * BoxIndex: 0 1 2 3 4 5
 * Count: X 0 1 2 0 0
 * 
 * .
 * .
 * .
 * 
 * BoxIndex: 0 1 2 3 4 5
 * Count: X 1 3 4 1 1
 */