import java.util.ArrayList;

record Customer(String name, ArrayList<Double> balance) {
    public Customer(String name, double amt) {
        this(name.toUpperCase(), new ArrayList<Double>(50));
        balance().add(amt);
    }
}

public class RecordExample {
    public static void main(String[] args) {
        Customer customer = new Customer("Bikash Shrestha", 50000);
        System.out.println(customer); //Customer[name=BIKASH SHRESTHA, balance=[50000.0]]
        
        //add amount
        customer.balance().add(1400.00);
        System.out.println(customer); //Customer[name=BIKASH SHRESTHA, balance=[50000.0, 1400.0]]
    }
}
