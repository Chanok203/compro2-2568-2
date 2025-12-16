import java.util.Arrays;
import java.util.Scanner;

public class SlotReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr1 = new int[N+1];
        int[] arr2 = new int[N+1];

        int K = sc.nextInt();
        int P = sc.nextInt();
        for (int p = 0; p < P; p++) {
            int index = sc.nextInt();
            if (arr1[index] < K) {
                arr1[index]++;
                System.out.println(1);
            } else {
                arr2[index]++;
                System.out.println(2);
            }

            // log
            // System.out.println("arr1: " + Arrays.toString(arr1));
            // System.out.println("arr2: " + Arrays.toString(arr2));
        }

        for (int i = 1; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}
/**
 * arr1 = [0, 0, 0, 0, 0]
 * arr2 = [0, 0, 0, 0, 0]
 * 
 * input = 3
 * arr1 = [0, 0, 1, 0, 0]
 * arr2 = [0, 0, 0, 0, 0] 
 * 
 * input = 5
 * arr1 = [0, 0, 1, 0, 1]
 * arr2 = [0, 0, 0, 0, 0] 
 * 
 * input = 4
 * arr1 = [0, 0, 1, 1, 1]
 * arr2 = [0, 0, 0, 0, 0]
 */