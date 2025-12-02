import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        System.out.printf("a = %d", a);
        System.out.println();
        System.out.printf("b = %d", b);
        System.out.println();
        System.out.printf("c = %.4f", c);
        System.out.println();
        System.out.printf("d = %.4f", d);
        System.out.println();

        int ab = a % b;
        System.out.printf("ab = %d", ab);
    }

}
