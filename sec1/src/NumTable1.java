import java.util.Scanner;

public class NumTable1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] arr = new int[R + 1][C + 1];
        for (int r = 1; r <= R; ++r) {
            for (int c = 1; c <= C; ++c) {
                arr[r][c] = sc.nextInt();
            }
        }
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            boolean isvalidR = (1 <= r && r <= R);
            boolean isvalidC = (1 <= c && c <= C);

            if (isvalidR && isvalidC) {
                System.out.print(arr[r][c]);
            } else {
                System.out.print("-");
            }
        }
    }
}
