import java.util.Scanner;
public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();
        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        for (int n = start; n <= end; n++) {
            int flag = 0;
            if (n <= 1) {
                continue;
            }
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print(n + " ");
            }
        }
        sc.close();
    }
}
