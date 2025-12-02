public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello\nWorld\n2028");
        System.out.println();

        System.out.println("Hello"); // == System.out.print("Hello\n");
        System.out.println("World");
        System.out.println("2028");

        System.out.printf("%d + %d = %d", 5, 10, 5+10);
        System.out.println();
        System.out.printf("X = %.4f", 5.9987451248785);
    }
}
