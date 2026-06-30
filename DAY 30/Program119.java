import java.util.Scanner;
public class Program119{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] empId = new int[100];
        String[] empName = new String[100];
        double[] empSalary = new double[100];
        int count = 0;
        int choice;
        do {
            System.out.println("\n=== Mini Employee Management System ===");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    empId[count] = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    empName[count] = sc.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    empSalary[count] = sc.nextDouble();
                    count++;
                    System.out.println("Employee Added Successfully!");
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("No Employee Records Found!");
                    } else {
                        System.out.println("\nEmployee Records:");
                        System.out.println("ID\tName\t\tSalary");
                        for (int i = 0; i < count; i++) {
                            System.out.println(
                                empId[i] + "\t" +
                                empName[i] + "\t\t₹" +
                                empSalary[i]
                            );
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (empId[i] == searchId) {
                            System.out.println("Employee Found!");
                            System.out.println("ID: " + empId[i]);
                            System.out.println("Name: " + empName[i]);
                            System.out.println("Salary: ₹" + empSalary[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee Not Found!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting Employee Management System...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 4);
        sc.close();
    }
}