import java.util.Scanner;

public class Program68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Common elements are:");
        for (int i = 0; i < n1; i++) {
            int found = 0;
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    found = 1;
                    break;
                }
            }
            if (found == 1) {
                System.out.print(arr1[i] + " ");
            }
        }
        sc.close();
    }
}
