package staticandinstancevariables;

public class Dog {
    public String name;

    public Dog(String name) {
        this.name = name;
    }
    
    public void printName() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Dog coco = new Dog("Coco");
        Dog buddy = new Dog("Buddy");
        coco.printName(); // Coco
        buddy.printName(); // Buddy
    }
}
