import java.util.ArrayList;
import java.util.Scanner;

public class LectRoom1_Task4 {
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

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int classCode = sc.nextInt();
            int n = sc.nextInt();

            int[] idxArr = findByClassCode(rooms, classCode);
            if (idxArr.length == 0) {
                System.out.println("sorry");
                continue;
            }

            boolean wasBreak = false;
            for (int j = 0; j < idxArr.length; j++) {
                int idx = idxArr[j];
                LectRoom lr = rooms[idx];
                boolean reserved = lr.reserveSeats(n);
                if (reserved) {
                    System.out.println(lr.name);
                    wasBreak = true;
                    break;
                }
            }

            if (!wasBreak) {
                System.out.println("sorry");
            }

        }
    }

    static int[] findByClassCode(LectRoom[] rooms, int classCode) {
        ArrayList<Integer> indices = new ArrayList<>();
        for (int j = 0; j < rooms.length; j++) {
            if (rooms[j].classCode == classCode) {
                indices.add(j);
            }
        }
        int[] arr = new int[indices.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = indices.get(i);
        }
        return arr;
    }
}
class LectRoom {
    int classCode;
    String name;
    int capacity;
    int currentSeats;
    LectRoom(int classCode, String name, int capacity) {
        this.classCode = classCode;
        this.name = name;
        this.capacity = capacity;
        this.currentSeats = 0;
    }
    boolean reserveSeats(int n) {
        if (this.currentSeats + n > this.capacity) {
            return false;
        }

        this.currentSeats = this.currentSeats + n;
        return true;
    }
}