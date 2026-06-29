import java.util.Scanner;
public class Program114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int choice;
        do {
            System.out.println("\n=== Array Operations Menu ===");
            System.out.println("1. Display Array");
            System.out.println("2. Find Sum");
            System.out.println("3. Find Largest Element");
            System.out.println("4. Search Element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Array Elements: ");
                    for (int num : arr) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    int sum = 0;
                    for (int num : arr) {
                        sum += num;
                    }
                    System.out.println("Sum = " + sum);
                    break;
                case 3:
                    int largest = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] > largest) {
                            largest = arr[i];
                        }
                    }
                    System.out.println("Largest Element = " + largest);
                    break;
                case 4:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == key) {
                            System.out.println("Element found at index " + i);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Element not found.");
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