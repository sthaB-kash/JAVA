package method_reference;

@FunctionalInterface
interface Welcome {
    Greeting greet(String mesage);
}

class Greeting {
    public Greeting(String message){
        System.out.println(message);
    }
}
public class Example1 {
    public static void main(String[] args) {
        // method reference - constructor
        Welcome welcome = Greeting::new;
        System.out.println(welcome.greet("Hello Java Dev!"));
    }
}
