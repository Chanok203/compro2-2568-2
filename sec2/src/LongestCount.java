import java.util.Scanner;

/**
 * Com Pro 2, Week 3 (String Basics), Problem 5-LongestString4
 * @author Pinyo Taeprasartsit
 */
public class LongestCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxLength = Integer.MIN_VALUE;
        int longestCount = 0;
        while(true) {
            String str = scan.nextLine();
            if(str.length() == 0)
                break;
            if(str.length() == maxLength) { //เมื่อเจอขค.ยาวสุดที่เท่าเดิม
                longestCount += 1;  
            } else if(str.length() > maxLength) { //เมื่อเจอขค.ยาวสุดอันใหม่
                maxLength = str.length(); 
                longestCount = 1;  // reset count ใหม่ด้วยแต่เป็น 1 เพราะต้องนับตัวเองด้วย
            }
        }
        System.out.println(maxLength);
        System.out.println(longestCount);
        scan.close();
    }
}