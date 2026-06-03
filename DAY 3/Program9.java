import java.util.Scanner;
public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int flag = 0;
        if (n <= 1) {
            flag = 1;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }
        }
         if (flag == 0) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is NOT a Prime Number");
        }
        sc.close();
    }
}