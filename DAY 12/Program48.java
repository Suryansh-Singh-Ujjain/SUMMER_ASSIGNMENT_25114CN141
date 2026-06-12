import java.util.Scanner;
public class Program48 {
    static int perfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (perfect(num) == 1) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
        sc.close();
    }
}