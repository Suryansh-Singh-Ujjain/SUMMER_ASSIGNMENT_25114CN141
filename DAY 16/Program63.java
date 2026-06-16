import java.util.Scanner;
public class Program63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target sum: ");
        int sum = sc.nextInt();
        int found = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("Pair found: " + arr[i] + " and " + arr[j]);
                    found = 1;
                }
            }
        }

        if (found == 0) {
            System.out.println("No pair found");
        }

        sc.close();
    }
}
