package staticandinstancevariables;

public class DogExample {
    private static String name;

    public DogExample(String name) {
        DogExample.name = name;
    }

    public void printName() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        DogExample d1 = new DogExample("Coco");
        DogExample d2 = new DogExample("Buddy");
        d1.printName(); // Buddy
        d2.printName(); // Buddy
    }
}
