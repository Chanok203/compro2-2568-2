public class Array1D {
    public static void main(String[] args) {
        // Create Array Object
        int[] arr1 = new int[5]; // {0, 0, 0, 0, 0}
        int[] arr2 = { -5, 8, 4, 37 };

        // Access by Index
        int[] arr3 = { 4, 5, 8, 9, 6 };
        int a = arr3[0]; // a = 4
        int b = arr3[3]; // b = 9;
        int c = arr3[-1]; // Error (ArrayIndexOutOfBoundException)
        int d = arr3[5]; // Error (ArrayIndexOutOfBoundException)

        // Assign Value to Array
        int[] arr4 = { 7, 8, 94, 2, 5 };
        arr4[0] = 20; // { 20, 8, 94, 2, 5 }
        arr4[2] = 40; // { 20, 8, 40, 2, 5 }
        arr4[-5] = 30; // Error (ArrayIndexOutOfBoundException)
        arr4[6] = 50; // Error (ArrayIndexOutOfBoundException)
    }
}