import java.util.Arrays;
import java.util.Scanner;

class Animal {
    static int count = 0;

    String id;
    int maxFood;
    int curFood;

    public Animal(int maxFood) {
        this.id = String.format("Animal_%d", ++Animal.count);
        this.maxFood = maxFood;
        this.curFood = 0;
    }

    void eat(int food) {
        this.curFood = Math.min(this.maxFood, this.curFood + food);
    }

    void printInfo() {
        String line = String.format("%s %d/%d", this.id, this.curFood, this.maxFood);
        System.out.println(line);
    }

}

class Cow extends Animal {

    public Cow(int maxFood) {
        super(maxFood);
    }

}

class Sheep extends Animal {
    public Sheep() {
        super(30);
    }

    @Override
    void eat(int food) {
        super.eat(food / 2);
    }
}

public class AnimalFarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // init animals
        int numAnimals = sc.nextInt();
        Animal[] animals = new Animal[numAnimals];
        for (int i = 0; i < numAnimals; ++i) {
            String type = sc.next();
            if (type.equals("Cow")) {
                int maxFood = sc.nextInt();
                animals[i] = new Cow(maxFood);
            } else if (type.equals("Sheep")) {
                animals[i] = new Sheep();
            } else {
                int maxFood = sc.nextInt();
                animals[i] = new Animal(maxFood);
            }
        }
        // eat
        while (true) {
            int index = sc.nextInt();
            if (index == -1) {
                break;
            }
            int food = sc.nextInt();
            animals[index].eat(food);
        }
        // filter
        String report = sc.next();

        if (report.equals("All")) {
            for (int i = 0; i < animals.length; i++) {
                animals[i].printInfo();
            }
        } else if (report.equals("Cow")) {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] instanceof Cow) {
                    animals[i].printInfo();
                }
            }
        } else if (report.equals("Sheep")) {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] instanceof Sheep) {
                    animals[i].printInfo();
                }
            }
        } else {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] instanceof Cow || animals[i] instanceof Sheep) {
                    continue;
                }

                animals[i].printInfo();
            }
        }
    }

}
