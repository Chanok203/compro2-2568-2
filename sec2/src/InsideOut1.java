import java.util.Scanner;

public class InsideOut1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.next();
        // String msg = "abcd";

        int L = msg.length();
        int mid = L / 2;

        if (L % 2 == 0) { // L is even
            for (int i = 1; i <= mid; i++) {
                System.out.print(msg.charAt(mid - i));
                System.out.print(msg.charAt(mid + i - 1));
            }
        } else { // L is odd
            System.out.print(msg.charAt(mid));
            for (int i = 1; i <= mid; i++) {
                System.out.print(msg.charAt(mid - i));
                System.out.print(msg.charAt(mid + i));
            }
        }

    }
}
