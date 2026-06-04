import java.util.Scanner;
public class Program16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();
        System.out.println("Armstrong numbers in the range:");
        for (int n = start; n <= end; n++) {
            int num = n;
            int sum = 0;
            while (num != 0) {
                int d = num % 10;
                sum = sum + (d * d * d);
                num = num / 10;
            }
            if (sum == n) {
                System.out.print(n + " ");
            }
        }
        sc.close();
    }
}
