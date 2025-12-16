import java.util.Scanner;

public class reserve3vans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = 0;
        int B = 0;
        int C = 0;
        int min = -1;
        for (int i = 0; i < N; i++) {
            int day = sc.nextInt();
            min = Math.min(A, Math.min(B, C));
            if (min == A) {
                System.out.println("A");
                A += day;
            }
        }
    }
}
