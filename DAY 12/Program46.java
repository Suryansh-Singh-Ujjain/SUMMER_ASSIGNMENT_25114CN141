import java.util.Scanner;
public class Program46 {
    static int armstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum = sum + (d * d * d);
            n = n / 10;
        }
        if (sum == original) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (armstrong(num) == 1) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
        sc.close();
    }
}
