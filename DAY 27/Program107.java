import java.util.Scanner;
public class Program107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[100];
        double[] basicSalary = new double[100];
        double[] netSalary = new double[100];
        int count = 0;
        int choice;
        do {
            System.out.println("\n=== Salary Management System ===");
            System.out.println("1. Add Employee Salary");
            System.out.println("2. View Salary Records");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Employee Name: ");
                    names[count] = sc.nextLine();
                    System.out.print("Enter Basic Salary: ");
                    basicSalary[count] = sc.nextDouble();
                    double hra = basicSalary[count] * 0.20;
                    double da = basicSalary[count] * 0.10;
                    netSalary[count] = basicSalary[count] + hra + da;
                    count++;
                    System.out.println("Salary Record Added Successfully!");
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("No Salary Records Found!");
                    } else {
                        System.out.println("\nEmployee Salary Details:");
                        System.out.println("Name\t\tBasic\t\tNet Salary");
                        for (int i = 0; i < count; i++) {
                            System.out.println(
                                names[i] + "\t\t" +
                                basicSalary[i] + "\t\t" +
                                netSalary[i]
                            );
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 3);
        sc.close();
    }
}