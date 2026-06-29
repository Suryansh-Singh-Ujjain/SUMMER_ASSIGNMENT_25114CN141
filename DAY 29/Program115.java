import java.util.Scanner;
public class Program115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int choice;
        do {
            System.out.println("\n=== String Operations Menu ===");
            System.out.println("1. Find Length");
            System.out.println("2. Reverse String");
            System.out.println("3. Convert to Uppercase");
            System.out.println("4. Check Palindrome");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Length = " + str.length());
                    break;
                case 2:
                    String reverse = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        reverse += str.charAt(i);
                    }
                    System.out.println("Reversed String = " + reverse);
                    break;
                case 3:
                    System.out.println("Uppercase String = " + str.toUpperCase());
                    break;
                case 4:
                    String rev = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        rev += str.charAt(i);
                    }
                    if (str.equalsIgnoreCase(rev)) {
                        System.out.println("String is a Palindrome.");
                    } else {
                        System.out.println("String is not a Palindrome.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 5);
        sc.close();
    }
}