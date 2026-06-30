import java.util.Scanner;
public class Program120{
    static String[] names = new String[100];
    static String[] phones = new String[100];
    static int count = 0;
    static void addContact(Scanner sc) {
        System.out.print("Enter Contact Name: ");
        names[count] = sc.nextLine();
        System.out.print("Enter Phone Number: ");
        phones[count] = sc.nextLine();
        count++;
        System.out.println("Contact Added Successfully!");
    }
    static void viewContacts() {
        if (count == 0) {
            System.out.println("No Contacts Found!");
            return;
        }
        System.out.println("\n=== Contact List ===");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + names[i] + " - " + phones[i]);
        }
    }
    static void searchContact(Scanner sc) {
        System.out.print("Enter Contact Name to Search: ");
        String search = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(search)) {
                System.out.println("Contact Found!");
                System.out.println("Name: " + names[i]);
                System.out.println("Phone: " + phones[i]);
                return;
            }
        }
        System.out.println("Contact Not Found!");
    }
    static void updateContact(Scanner sc) {
        System.out.print("Enter Contact Name to Update: ");
        String search = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(search)) {
                System.out.print("Enter New Phone Number: ");
                phones[i] = sc.nextLine();
                System.out.println("Contact Updated Successfully!");
                return;
            }
        }
        System.out.println("Contact Not Found!");
    }
    static void deleteContact(Scanner sc) {
        System.out.print("Enter Contact Name to Delete: ");
        String search = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(search)) {
                for (int j = i; j < count - 1; j++) {
                    names[j] = names[j + 1];
                    phones[j] = phones[j + 1];
                }
                count--;
                System.out.println("Contact Deleted Successfully!");
                return;
            }
        }
        System.out.println("Contact Not Found!");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n=== Contact Management System ===");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addContact(sc);
                    break;
                case 2:
                    viewContacts();
                    break;
                case 3:
                    searchContact(sc);
                    break;
                case 4:
                    updateContact(sc);
                    break;
                case 5:
                    deleteContact(sc);
                    break;
                case 6:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 6);
        sc.close();
    }
}