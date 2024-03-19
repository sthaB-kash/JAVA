package method_reference;

import java.util.function.BiFunction;

public class Example {
    public static <T> T concatOperation(T str1, T str2, BiFunction<T, T, T> concat) {
        return concat.apply(str1, str2);
    }

    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public String concatName(String fname, String lname) {
        return fname + " " + lname;
    }

    public static void main(String[] args) {
        //with lambda expression
        System.out.println(Example.concatOperation("Head", "First", (name1, name2) -> name1+name2));

        //using method reference i.e. without lambda expression
        System.out.println(Example.concatOperation("Bikash", "Shrestha", Example::fullName));

        // method reference - instance method
        Example obj = new Example();
        System.out.println(Example.concatOperation("Bikash", "Shrestha", obj::concatName));

        // method reference - arbitrary object of a particular type
        System.out.println(Example.concatOperation("Java", "Programming", String::concat));
    }
}
