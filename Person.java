import java.util.Scanner;

public class Person {
    String name;
    String email;
    String country;

    //GETTER
    public String getName() {
        return this.name;
    }
    
    public String getEmail() {
        return this.email;
    }

    public String getCountry() {
        return this.country;
    }

    // SETTER
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCountry(String nation) {
        country = nation;
    }

    // The main method
    public static void main( String[] args) {
        Person person = new Person();
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        person.setName(sc.nextLine());
        System.out.println("What's your email address?");
        person.setEmail(sc.next());
        System.out.println("Where are you from?");
        person.setCountry(sc.next());

        // Print the details of the person.
        System.out.println("The following are the details of the person: \nName: " + person.getName() +
                             "\nEmail: " + person.getEmail() + "\nCountry: " + person.getCountry());
    }
}
