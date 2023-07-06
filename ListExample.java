import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ListExample {
    public static void main(String[] args) {
        String[] fruits = { "apple", "orange", "banana", "mango" };
        List<String> fruitItems = List.of(fruits);
        // list.add("pineapple");  -> we can not add new element because it is immutable
        System.out.println(fruitItems); // [apple, orange, banana, mango]

        ArrayList<String> groceries = new ArrayList<>(fruitItems);
        groceries.add("yogurt");
        System.out.println(groceries); //[apple, orange, banana, mango, yogurt]

        ArrayList<String> items = new ArrayList<>(
            List.of("pickles", "mustard", "cheese")
        );

        System.out.println(items);// [pickles, mustard, cheese]

        groceries.addAll(items);

        System.out.println(groceries); //[apple, orange, banana, mango, yogurt, pickles, mustard, cheese]

        // add more items
        groceries.addAll(Arrays.asList("eggs", "lemon")); 
        System.out.println(groceries); //[apple, orange, banana, mango, yogurt, pickles, mustard, cheese, eggs, lemon]

        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries); //[apple, banana, cheese, eggs, lemon, mango, mustard, orange, pickles, yogurt]

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries); //[yogurt, pickles, orange, mustard, mango, lemon, eggs, cheese, banana, apple]
    }
}