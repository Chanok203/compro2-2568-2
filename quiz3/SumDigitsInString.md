# SumDigitsInString

ให้พิจารณาสตริงที่อาจมีตัวเลขปะปนอยู่กับตัวอักษร เช่น

a1b23c4

ตัวเลขที่อยู่ในสตริงคือ `1, 2, 3, 4` ดังนั้นผลรวมของตัวเลขคือ

1 + 2 + 3 + 4 = 10

จงเขียนเมธอดแบบ **recursion** เพื่อหาผลรวมของตัวเลขทั้งหมดที่อยู่ในสตริง

ห้ามใช้ `for` หรือ `while`

---

## ตัวอย่าง

| ข้อมูลเข้า | ข้อมูลออก |
|---|---|
| a1b23c4 | 10 |
| abc | 0 |
| 12345 | 15 |
| a9x8y7 | 24 |

---

## Code

```java
import java.util.Scanner;

public class SumDigitsInString {

    static int sumDigits(String str) {
        // เขียน recursion
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans = sumDigits(str);
        System.out.println(ans);
    }
}
