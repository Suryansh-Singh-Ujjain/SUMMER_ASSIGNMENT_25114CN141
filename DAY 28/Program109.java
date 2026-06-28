import java.util.Scanner;
public class Program109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] books = new String[100];
        int count = 0;
        int choice;
        do {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Book Name: ");
                    books[count] = sc.nextLine();
                    count++;
                    System.out.println("Book Added Successfully!");
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("No Books Available!");
                    } else {
                        System.out.println("\nAvailable Books:");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + books[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting Library Management System...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 3);
        sc.close();
    }
}