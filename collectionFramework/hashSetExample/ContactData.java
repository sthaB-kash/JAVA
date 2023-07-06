package collectionFramework.hashSetExample;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class ContactData {
    private static final String phoneData = """
            Charlie Brown, 3334445555
            Maid Marion, 1234567890
            Mickey Mouse, 9998887777
            Mickey Mouse, 1247489758
            Minnie MOuse, 4567805666
            Robin Hood, 5647893000
            Robin Hood, 7899028222
            Lucy Van Pelt, 5642086852
            Mickey Mouse, 9998887777
            """;

    private static final String emailData = """
        Mickey Mouse, mckmouse@gmail.com
        Mickey Mouse, micky1@aws.com
        Minnie Mouse, minnie@verizon.net
        Robin Hood, rhoood@gmail.com
        Linus Van Pelt, lvpelt@gmail.com
        Daffy Duck, Daffy@google.com
        """;

    public static List<Contact> getData(String type) {
        List<Contact> contactList = new ArrayList<>();
        Scanner scanner = new Scanner(type.equals("phone") ? phoneData : emailData);
        while (scanner.hasNext()) {
            String[] data = scanner.nextLine().split(",");
            Arrays.asList(data).replaceAll(String::trim);
            if (type.equals("phone")) {
                contactList.add(new Contact(data[0],null, Long.parseLong(data[1])));
            } else if (type.equals("email")) {
                contactList.add(new Contact(data[0], data[1]));
            }
        }
        scanner.close();
        return contactList;
    }
}