import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {
    public String toString() {
        return String.format("%s(%d)", name, distance);
    }
}

public class IteratorExample {
    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<Place>();
        Place ktm = new Place("Kathmandu", 180);
        addPlace(placesToVisit, ktm);

        addPlace(placesToVisit, new Place("kathmandu", 180)); //check for case sensitive matching
        addPlace(placesToVisit, new Place("Kathmandu", 180));

        addPlace(placesToVisit, new Place("Pokhara", 150));
        addPlace(placesToVisit, new Place("Butwal", 200));
        addPlace(placesToVisit, new Place("Bhaktapur", 197));
        addPlace(placesToVisit, new Place("Sindhuli", 280));

        addPlace(placesToVisit, new Place("Chitwan", 0));
        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;
        printMenu();
        while(!quitLoop) {
            if(!iterator.hasNext()) {
                System.out.println("Final Place: " + iterator.previous());
                forward = false;
            }

            if(!iterator.hasPrevious()) {
                System.out.println("Origination Place: " + iterator.next());
                forward = true;
            }

            System.out.println("Enter Value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);
            switch(menuItem) {
                case "F":
                    if(!forward) {
                        forward = true;
                        if(iterator.hasNext()) {
                            iterator.next();
                        }
                    }
                    if(iterator.hasNext()) {
                        System.out.println("forward: " + iterator.next());
                    }
                    
                    break;
                case "B": 
                    if(forward) {
                        forward = false;
                        if(iterator.hasPrevious()) {
                            iterator.previous();
                        }
                    }
                    if(iterator.hasPrevious()) {   
                        System.out.println("Backward: " + iterator.previous());
                    }
                    break;
                case "L": 
                    System.out.println(placesToVisit);
                    break;
                case "M":
                    printMenu();
                    break;
                case "Q": 
                    System.out.println("Bye!");
                    quitLoop = true;
                    scanner.close();
                    break;
                default: 
                    System.out.println("Please enter a valid option");
                    break;
            }

        }
    }

    private static void addPlace(LinkedList<Place> list, Place place) {
        if(list.contains(place)) {
            System.out.println("Found duplicate: " + place);
            return;
        }

        for(Place p : list) {
            if(p.name().equalsIgnoreCase(place.name())) {
                System.out.println(String.format("Found Duplicate(%s matched with record %s)", place.name(), p.name()));
                return;
            }
        }

        int matchedIndex = 0;
        for(var listPlace : list) {
            if(place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }


    private static void printMenu() {
        System.out.println("""
            Please Select An Option: 
            (F)orward
            (B)ackwards
            (L)ist Places
            (M)enu
            (Q)uit
        """);
    }

}