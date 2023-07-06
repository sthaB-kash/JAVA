import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        System.out.print("Enter your name: " );
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.print("Please Enter Your DOB");
        int dob = Integer.parseInt(sc.next());
        int age = 2023 - dob;
        System.out.println("So you are " + age + " years old.");
    }
}
