# CountFirstDigit

ให้พิจารณาสตริงที่อาจมีตัวอักษรและตัวเลขปะปนกัน เช่น

123abc45

ในตัวอย่างนี้ ตัวเลขที่อยู่ **ติดกันตั้งแต่ต้นสตริง** คือ

123

ดังนั้นคำตอบคือ **3**

จงเขียนเมธอดแบบ **recursion** เพื่อหาจำนวนตัวเลขที่ปรากฏติดกันตั้งแต่ต้นสตริง

ห้ามใช้ `for` หรือ `while`

---

## ตัวอย่าง

| input | output |
|---|---|
| 123abc | 3 |
| 9xyz | 1 |
| abc123 | 0 |
| 456789a | 6 |

---

## Code

```java
import java.util.Scanner;

public class CountFirstDigit {

    static int countFirstDigit(String str) {
        // เขียน recursion
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans = countFirstDigit(str);
        System.out.println(ans);
    }
}
