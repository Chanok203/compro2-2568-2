import java.util.Scanner;

public class InsideOut2_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.next();
        int x = sc.nextInt();
        
        // String msg = "abcdefgh";
        // int x = 5;

        int L = msg.length();
        int mid = L / 2;
        int tmp = 1;

        if (L % 2 != 0) {
            System.out.print(msg.charAt(x));
            // System.out.println(x);
            tmp = 0;
        } else {
            x += 1;
        }

        for (int i = 1; i <= mid; i++) {
            int left = x - i;
            int right = x + i - tmp;

            if (left < 0) {
                left += L;
            }

            if (right >= L) {
                right -= L;
            }

            // System.out.print(left);
            // System.out.print(" ");
            // System.out.print(right);
            // System.out.println();


            System.out.print(msg.charAt(left));
            System.out.print(msg.charAt(right));
        }
    }
}
