import java.util.Scanner;

public class CharCount1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] freq = new int[26]; // หรือจะใช้ 100 ก็ได้
        int line = 0;
        String str = sc.nextLine();
        line++;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // ปรับให้ ascii อย่าง 65 (อักษร A) เป็น 0
            int index = ch - 'A'; 
            freq[index]++; // เพิ่มความถื่เมื่อพบ
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i]>0) {
                System.out.println((char)(i+65)+" "+freq[i]);
            }
        }
    }
}
