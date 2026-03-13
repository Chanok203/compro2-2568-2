# MaxConsec

ในบางกรณี ข้อความ (string) อาจมีตัวอักษรที่ซ้ำกันหลายครั้งติดกัน เช่น

aaabbccccb

ในตัวอย่างนี้ ตัวอักษร `c` ปรากฏติดกันมากที่สุด คือ **4 ครั้ง**

จงเขียนเมธอดเพื่อหาจำนวนตัวอักษรที่ซ้ำติดกันมากที่สุดในสตริง โดยใช้ **recursion**

ห้ามใช้ `for` หรือ `while` ภายในเมธอด

---

## ข้อมูลเข้า

บรรทัดที่ 1 เป็นสตริงที่ประกอบด้วยตัวอักษรภาษาอังกฤษพิมพ์เล็กทั้งหมด

---

## ข้อมูลออก

แสดงจำนวนตัวอักษรที่ซ้ำติดกันมากที่สุด

---

## ตัวอย่าง

| ข้อมูลเข้า | ข้อมูลออก |
|---|---|
| aaabbccccb | 4 |
| abc | 1 |
| aaaaa | 5 |
| ababab | 1 |

---

## Code

```java
import java.util.Scanner;

public class MaxConsec {

    static int countFirstConsec(String str) {
        // เขียน recursion เพื่อหาจำนวนตัวอักษรตัวแรกที่ซ้ำติดกัน
    }

    static int maxConsec(String str) {
        // เขียน recursion เพื่อหาจำนวนตัวอักษรที่ซ้ำติดกันมากที่สุด
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans = maxConsec(str);
        System.out.println(ans);
    }
}
