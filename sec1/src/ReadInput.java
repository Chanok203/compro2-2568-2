import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = sc.nextDouble();

        System.out.printf("a = %d\n", a);
        System.out.printf("b = %d\n", b);
        System.out.printf("c = %.6f\n", c);
    }
}
