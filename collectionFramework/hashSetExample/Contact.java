package collectionFramework.hashSetExample;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Contact {
    private String name;
    private Set<String> emails = new HashSet<>();
    private Set<String> phoneNumbers = new HashSet<>();

    public Contact(String name) {
        this(name, null);
    }

    public Contact(String name, String email) {
        this(name, email, 0);
    }

    public Contact(String name, String email, long phoneNumber) {
        this.name = name;
        if( email != null) {
            this.emails.add(email);
        }

        if (phoneNumber > 0) {
            String phone = String.valueOf(phoneNumber);
            phone = "(%s) %s-%s".formatted(phone.substring(0, 3), phone.substring(3, 6), phone.substring(6));
            this.phoneNumbers.add(phone);
        }
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "%s: %s %s".formatted(name, emails, phoneNumbers);
    }

    public Contact mergeContactData(Contact contact) {
        Contact newContact = new Contact(name);
        newContact.emails = new HashSet<>(this.emails);
        newContact.phoneNumbers = new HashSet<>(this.phoneNumbers);
        newContact.emails.addAll(contact.emails);
        newContact.phoneNumbers.addAll(contact.phoneNumbers);
        return newContact;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contact contact = (Contact) obj;
        // return getName().equals(contact.getName()) && Objects.equals(emails, contact.emails) &&
        //     Objects.equals(phoneNumbers, contact.phoneNumbers);
        return getName().equals(contact.getName());
    }

    public int hashCode() {
        // return Objects.hash(getName(), emails, phoneNumbers);
        return 33 * getName().hashCode();
    }

}
    