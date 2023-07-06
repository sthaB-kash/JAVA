
import java.util.Arrays;
import java.util.ArrayList;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name){
        this(name, "Dairy", 1);
    }

    // @override
    public String toString() {
        return String.format("%d %s in %s", count, name, type);
    }
}

public class ArrayListExample {
    public static void main(String[] args) {
        Object[] items = new Object[3]; // array of 3 objects
        items[0] = new GroceryItem("Milk");
        items[1] = new GroceryItem("Apple", "Fruits", 3);
        items[2] = "Banana Fruits 5"; // it is string so it can be added to the items
        System.out.println(Arrays.toString(items));


        // now create a GroceryItem array
        GroceryItem[] groceryItems = new GroceryItem[3];
        groceryItems[0] = new GroceryItem("Apple", "Fruits", 4);
        groceryItems[1] = new GroceryItem("Milk");
        groceryItems[2] = new GroceryItem("yogurt");
        System.out.println(Arrays.toString(groceryItems));

        ArrayList objects = new ArrayList(); // we can store any type of object in this array list
        items[0] = new GroceryItem("Milk");
        items[1] = new GroceryItem("Apple", "Fruits", 3);
        items[2] = "Banana Fruits 5";

        System.out.println(Arrays.toString(items));

        ArrayList<GroceryItem> groceryObjects = new ArrayList<>();
        groceryObjects.add(new GroceryItem("Yogurt"));
        groceryObjects.add(new GroceryItem("Pineapple", "Fruits", 34));
        System.out.println(groceryObjects);
    }
}
   