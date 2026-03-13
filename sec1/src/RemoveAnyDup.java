import java.util.Scanner;

public class RemoveAnyDup {

    String removeAnyDup(String str) {
        int L = str.length();
        if (L <= 1) {
            return str;
        }

        char last = str.charAt(L-1);
        String remains = str.substring(0, L-1);

        int second = remains.indexOf(last);

        String next = removeAnyDup(remains);

        return (second == -1) ? next + last : next;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        RemoveAnyDup remover = new RemoveAnyDup();
        String result = remover.removeAnyDup(str);
        System.out.println(result);
    }

}
