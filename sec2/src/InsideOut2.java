import java.util.Scanner;

public class InsideOut2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.next();
        int x = sc.nextInt();
        int L = msg.length();
        int mid = L / 2;
        if (L % 2 == 0) { // L is even
            x += 1;
            for (int i = 1; i <= mid; i++) {
                int left = x - i;
                int right = x + i - 1;
                if (left < 0) left += L;
                if (right >= L) right -= L;
                System.out.print(msg.charAt(left));
                System.out.print(msg.charAt(right));
            }
        } else { // L is odd
            System.out.print(msg.charAt(x));
            for (int i = 1; i <= mid; i++) {
                int left = x - i;
                int right = x + i;
                if (left < 0) left += L;
                if (right >= L) right -= L;
                System.out.print(msg.charAt(left));
                System.out.print(msg.charAt(right));
            }
        }

    }
}
