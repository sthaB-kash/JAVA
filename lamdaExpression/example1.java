package lamdaExpression;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;

public class example1 {

    record Person(String firstName, String lastName) {
        public String toString() {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
            new Person("Bikash", "Shrestha"),
            new Person("Lucy", "Van Pelt"),
            new Person("Sally", "Brown"),
            new Person("Linus", "VAn Pelt"),
            new Person("Pepperimint", "Patty"),
            new Person("Charlie", "Brown")
            ));
        System.out.println(people);

        var comparatorLastName = new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.lastName().compareTo(p2.lastName());
            }

        };
        people.sort(comparatorLastName);
        System.out.println(people);
    }
}