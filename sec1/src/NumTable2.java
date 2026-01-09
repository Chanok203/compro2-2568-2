import java.util.Scanner;

public class NumTable2 {
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
        int prev = -1;
        int count = 1;

        for (int i = 0; i < N; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            boolean isvalidR = (1 <= r && r <= R);
            boolean isvalidC = (1 <= c && c <= C);

            if (isvalidR && isvalidC) {
                if (arr[r][c] == prev) {
                    System.out.print("*");
                } else {
                    System.out.print(arr[r][c]);
                }
                prev = arr[r][c];
                count = 0;
            } else {
                if (count == 0) {
                    System.out.println();
                }
                count++;
                prev = -1;
            }
        }
    }
}
