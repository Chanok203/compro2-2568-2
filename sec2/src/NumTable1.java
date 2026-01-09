import java.util.Scanner;

/**
 * Com Pro 2, Midterm, 2559-3, July 5, 2017
 * @author Pinyo Taeprasartsit
 */
public class NumTable1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int R = scan.nextInt();
        int C = scan.nextInt();
        int[][] table = new int[R+1][C+1]; //เริ่มด้วย 1
        for(int row = 1; row <= R; ++row) {
            for(int col = 1; col <= C; ++col) {
                table[row][col] = scan.nextInt();
                //เริ่มด้วย 1
            }
        }
        final int N = scan.nextInt();
        for(int i = 0; i < N; ++i) { // ทำงาน N รอบเท่านั้น
            int row = scan.nextInt();
            int col = scan.nextInt();
            if(row < 1 || row > R || col < 1 || col > C)
                System.out.print('-');
            else
                System.out.print(table[row][col]);
        }
    }
}
