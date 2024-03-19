package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        numbers.stream().filter(n -> n > 3).forEach( n -> System.out.println(n));
    }
}
