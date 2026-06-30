import java.util.Scanner;
public class Program117{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[100];
        int[] marks = new int[100];
        int count = 0;
        int choice;
        do {
            System.out.println("\n=== Student Record System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    names[count] = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    marks[count] = sc.nextInt();
                    count++;
                    System.out.println("Student Record Added Successfully!");
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("No Records Found!");
                    } else {
                        System.out.println("\nStudent Records:");
                        System.out.println("Name\t\tMarks");

                        for (int i = 0; i < count; i++) {
                            System.out.println(names[i] + "\t\t" + marks[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Student Name to Search: ");
                    String search = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (names[i].equalsIgnoreCase(search)) {
                            System.out.println("Student Found!");
                            System.out.println("Name: " + names[i]);
                            System.out.println("Marks: " + marks[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student Not Found!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 4);
        sc.close();
    }
}