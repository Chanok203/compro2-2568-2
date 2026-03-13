# CountBlocks

ให้พิจารณาสตริงที่อาจมีตัวอักษรซ้ำติดกัน เช่น

aaabbccccb

ถ้าเรามองเป็น "กลุ่มของตัวอักษรที่ซ้ำติดกัน" จะได้

aaa | bb | cccc | b

ดังนั้นสตริงนี้มีทั้งหมด **4 กลุ่ม**

จงเขียนเมธอดแบบ **recursion** เพื่อหาจำนวนกลุ่มของตัวอักษรที่ซ้ำติดกันในสตริง

ห้ามใช้ `for` หรือ `while`

---

## ตัวอย่าง

| ข้อมูลเข้า | ข้อมูลออก |
|---|---|
| aaabbccccb | 4 |
| abc | 3 |
| aaaaa | 1 |
| aabbaa | 3 |

---

## Code

```java
import java.util.Scanner;

public class CountBlocks {

    static int countFirstConsec(String str) {
        // helper method
    }

    static int countBlocks(String str) {
        // recursion
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans = countBlocks(str);
        System.out.println(ans);
    }
}
