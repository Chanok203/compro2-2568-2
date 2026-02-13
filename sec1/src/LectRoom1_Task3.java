import java.util.ArrayList;
import java.util.Scanner;

public class LectRoom1_Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        LectRoom[] rooms = new LectRoom[K];
        // ArrayList<LectRoom> rooms = new ArrayList<>();
        for (int k = 0; k < K; k++) {
            int classCode = sc.nextInt();
            String name = sc.next();
            int capacity = sc.nextInt();
            LectRoom lr = new LectRoom(classCode, name, capacity);
            rooms[k] = lr;
        }

        for (int i = 0; i < 3; i++) {
            int idx = sc.nextInt() - 1;
            LectRoom lr = rooms[idx];
            String line = String.format("%d %s %d", lr.classCode, lr.name, lr.capacity);
            System.out.println(line);
        }
    }
}

// class LectRoom {
//     int classCode;
//     String name;
//     int capacity;
//     int currentSeats;

//     LectRoom(int classCode, String name, int capacity) {
//         this.classCode = classCode;
//         this.name = name;
//         this.capacity = capacity;
//         this.currentSeats = 0;
//     }

//     boolean reserveSeats(int n) {
//         if (this.currentSeats + n > this.capacity) {
//             return false;
//         }

//         this.currentSeats = this.currentSeats + n;
//         return true;
//     }
// }
/*
5
122 Anek 60
121 RorWorTor1 180
121 RorWorTor2 200
122 Wiwit 300
211 RorWorTor1 200
3
4
1
 */