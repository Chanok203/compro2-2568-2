import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (n == 0) {
            System.out.println(0);
        } else {
            String ans = "";
            while (n > 0) {
                int r = n % k;
                ans = r + ans;
                n = n / k;
            }
            System.out.println(ans);
        }
    }
}