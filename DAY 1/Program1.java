import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input value of n
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        // Loop to calculate sum
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        // Display result
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);

        sc.close();
    }
}