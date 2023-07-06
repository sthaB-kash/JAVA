import java.util.Random;

public class EnumExample {
    public static void main(String[] args) {
        Weekdays day = Weekdays.MONDAY;
        System.out.println(day); //MONDAY


        System.out.printf("Name is %s, Ordinal Value = %d%n", day.name(), day.ordinal()); 

        var allDays = Weekdays.values();
        Random rand = new Random();
        int randomDay = rand.nextInt(7);
        System.out.printf("Random Day: %s%n ClassName: %s%n Simple ClassName: %s%n", allDays[randomDay], allDays.getClass().getName(), allDays.getClass().getSimpleName());

        for(Topping topping : Topping.values()) {
            System.out.println(topping.name() + ": " + topping.getPrice());
        }
    }
}

