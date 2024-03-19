package lamdaExpression;

import java.util.List;

@FunctionalInterface
interface Welcome {
    public void greeting();
}
public class LambdaExpression {
    public static void main(String[] args) {

        /*
         * without using lambda expression
         */
        Welcome welcome = new Welcome() { // Anonymous class implementation
            public void greeting() {
                System.out.println("Hello Bikash - without lambda expression");
            }
        };
        welcome.greeting();

        /*
         *    Using lambda expression
         */
        Welcome welcome1 = () -> System.out.println("Hello Bikash - using lambda expression");
        welcome1.greeting();

        //print every element of a list
        List<Integer> numbers = List.of(1, 2, 3, 4 ,5 );
        numbers.forEach( num -> System.out.println(num));
    }
}

