import java.util.Scanner;
public class Program24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (x): ");
        int x = sc.nextInt();
        System.out.print("Enter power (n): ");
        int n = sc.nextInt();
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * x;
        }
        System.out.println(x + "^" + n + " = " + res);
        sc.close();
    }
}
