package CH7;

import java.util.ArrayList;

public class PhoneBookEntry {
    private String name;
    private String phoneNumber;

    public PhoneBookEntry(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        ArrayList<PhoneBookEntry> phoneBook = new ArrayList<>();
        phoneBook.add(new PhoneBookEntry("Zubair", "123-456-7890"));
        phoneBook.add(new PhoneBookEntry("Ali", "987-654-3210"));
        phoneBook.add(new PhoneBookEntry("Fahad", "555-555-5555"));
        phoneBook.add(new PhoneBookEntry("Faisal", "111-222-3333"));
        phoneBook.add(new PhoneBookEntry("Saad", "999-888-7777"));

        System.out.println("Phone Book Entries:");
        for (PhoneBookEntry entry : phoneBook) {
            System.out.println("Name: " + entry.getName() + ", Phone Number: " + entry.getPhoneNumber());
        }
    }
}

