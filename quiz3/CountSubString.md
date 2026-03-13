# CountSubstring

ให้พิจารณาสตริง `str` และสตริง `pattern`

จงเขียนโปรแกรมแบบ **recursion** เพื่อนับจำนวนครั้งที่ `pattern` ปรากฏใน `str`

ห้ามใช้ `for` หรือ `while`

---

## ตัวอย่าง

| str | pattern | output |
|---|---|---|
| banana | ana | 1 |
| aaaaa | aa | 4 |
| hellohello | hello | 2 |
| abcde | xy | 0 |

---

## Code

```java
import java.util.Scanner;

public class CountSubstring {

    static boolean startsWith(String str, String pattern) {
        // helper method
    }

    static int countSubstring(String str, String pattern) {
        // recursion
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String pattern = sc.next();

        int ans = countSubstring(str, pattern);
        System.out.println(ans);
    }
}
