
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Kathmandu");
        list.add("Pokhara");

        list.add(0,"Lalitpur"); // adds element at the specified position

        addMoreElements(list);
        System.out.println("After adding elements on the LinkedList: " + list);

        //iterator 
        ListIterator<String> iterator = list.listIterator(1); //ListIterator<String> iterator = list.listIterator();
        String previous = list.peek(); // list.getFirst();
        while(iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("From: " + previous + " To: " + town );
            previous = town;
        }

        // removing item from the list
        var iterator1 = list.listIterator();
        while(iterator1.hasNext()) {
            if(iterator1.next().equals("Jhapa")) {
                iterator1.remove();
            }
        }
        System.out.println(list); //Jhapa will be removed from the list

        //backward
        while(iterator1.hasPrevious()) {
            System.out.println(iterator1.previous());
        }


        removeElements(list);
        System.out.println("After removing elements on the LinkedList: " + list);
    }

    public static void addMoreElements(LinkedList<String> district) {
        district.addFirst("Chitwan");
        district.addLast("Bhaktapur");

        //Queue methods
        district.offer("Palpa"); //inserts at end of queue
        district.offerFirst("Jhapa"); //inserts at the start of the queue
        district.offerLast("Nepalgunj"); //inserts at end of queue

        //stack methods
        district.push("Makawanpur"); //inserts at the start of stack
        district.push("Dharan");
        district.push("Kabhre");

    }

    static void removeElements(LinkedList<String> list) {
        // remove method returns what is removed if we provide index value greater than its size then its throws java.lang.IndexOutOfBoundsException
        System.out.printf("%s is removed from the list%n", list.remove(4)); 

        Boolean item = list.remove("Jhapa"); // return true if removed
        System.out.println(item);

        System.out.println(list);
        list.remove(); // removes 1st element
        list.removeFirst();
        list.removeLast();

       
        //Queue poll methods
        list.poll(); //removes first
        list.pollFirst();
        list.pollLast();
    }
}