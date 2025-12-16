import java.util.Arrays;

public class ShowArray1D {
    public static void main(String[] args) {
        int[] arr1 = { 5, 4, 8, 6, 2 };

        // Loop
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        // Arrays Package
        String arrString = Arrays.toString(arr1);
        System.out.println(arrString);

        // or
        System.out.println(Arrays.toString(arr1));
    }
}
