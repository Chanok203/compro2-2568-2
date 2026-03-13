import java.util.Scanner;

public class KeepTwo {
    String keepTwo(String str) {
        int L = str.length();

        if (L <= 1) {
            return str;
        }

        char last = str.charAt(L - 1);
        String remains = str.substring(0, L - 1);

        int left = remains.indexOf(last);
        int right = remains.lastIndexOf(last);

        String next = keepTwo(remains);

        return (left == right) ? next + last : next;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        KeepTwo kt = new KeepTwo();
        String answer = kt.keepTwo(str);
        System.out.println(answer);
    }
}
