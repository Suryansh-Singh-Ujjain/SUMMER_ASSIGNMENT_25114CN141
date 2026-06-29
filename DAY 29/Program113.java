import java.util.Scanner;
public class Program113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double num1, num2;
        do {
            System.out.println("\n=== Menu-Driven Calculator ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
                switch (choice) {
                    case 1:
                        System.out.println("Result = " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Result = " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Result = " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Result = " + (num1 / num2));
                        } else {
                            System.out.println("Division by zero is not allowed.");
                        }
                        break;
                }
            } else if (choice == 5) {
                System.out.println("Calculator Closed.");
            } else {
                System.out.println("Invalid Choice!");
            }
        } while (choice != 5);
        sc.close();
    }
}
