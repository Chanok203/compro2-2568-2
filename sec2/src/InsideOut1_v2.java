import java.util.Scanner;

public class InsideOut1_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.next();
        // String msg = "aeiou";

        int L = msg.length();
        int mid = L / 2;
        int tmp = 1;

        if (L % 2 != 0) {
            System.out.print(msg.charAt(mid));
            tmp = 0;
        }

        for (int i = 1; i <= mid; i++) {
            System.out.print(msg.charAt(mid - i));
            System.out.print(msg.charAt(mid + i - tmp));
        }
    }
}
