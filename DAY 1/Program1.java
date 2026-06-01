import java.util.Scanner;  
public class Program1 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        sc.close();
    }
}