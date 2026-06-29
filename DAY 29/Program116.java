import java.util.Scanner;
public class Program116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] productName = new String[100];
        int[] quantity = new int[100];
        int count = 0;
        int choice;
        do {
            System.out.println("\n=== Inventory Management System ===");
            System.out.println("1. Add Product");
            System.out.println("2. View Inventory");
            System.out.println("3. Update Quantity");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Product Name: ");
                    productName[count] = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    quantity[count] = sc.nextInt();
                    count++;
                    System.out.println("Product Added Successfully!");
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("No Products Available!");
                    } else {
                        System.out.println("\nInventory Records:");
                        System.out.println("Product Name\tQuantity");
                        for (int i = 0; i < count; i++) {
                            System.out.println(productName[i] + "\t\t" + quantity[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Product Name to Update: ");
                    String search = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (productName[i].equalsIgnoreCase(search)) {
                            System.out.print("Enter New Quantity: ");
                            quantity[i] = sc.nextInt();
                            System.out.println("Quantity Updated Successfully!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Product Not Found!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting Inventory Management System...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 4);
        sc.close();
    }
}