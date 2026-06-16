import java.util.Scanner;
public class Program64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < n; i++) {
            int duplicate = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = 1;
                    break;
                }
            }
            if (duplicate == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
