# CountPrefix

ให้พิจารณาสตริง `str` และตัวอักษร `c`

จงเขียนเมธอดแบบ **recursion** เพื่อหาจำนวนครั้งที่ `c`
ปรากฏ **ติดกันตั้งแต่ต้นสตริง**

ห้ามใช้ `for` หรือ `while`

---

## ตัวอย่าง

| str | c | output |
|---|---|---|
| aaabbc | a | 3 |
| bbbabc | b | 3 |
| abcaaa | a | 1 |
| xyz | x | 1 |
| xyz | a | 0 |

---

## Code

```java
import java.util.Scanner;

public class CountPrefix {

    static int countPrefix(String str, char c) {
        // เขียน recursion
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        int ans = countPrefix(str, c);
        System.out.println(ans);
    }
}
