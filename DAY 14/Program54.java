import java.util.Scanner;
public class Program54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to find frequency: ");
        int key = sc.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                c++;
            }
        }
        System.out.println("Frequency of " + key + " = " + c);
        sc.close();
    }
}
