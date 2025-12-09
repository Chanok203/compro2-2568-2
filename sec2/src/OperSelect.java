import java.util.Scanner;

public class OperSelect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        switch (z) {
            case 1:
                System.out.println(x + y);
                break;
            case 2:
                System.out.println(x-y);
                break;
            default:
                break;
        }
    }
}
