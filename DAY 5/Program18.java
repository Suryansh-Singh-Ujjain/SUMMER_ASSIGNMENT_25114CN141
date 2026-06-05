import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int orig = num;
        int sum = 0;
        while (num != 0) {
            int d = num % 10;
            int fact = 1;
            for (int i = 1; i <= d; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            num = num / 10;
        }
        if (sum == orig) {
            System.out.println(orig + " is a Strong Number");
        } else {
            System.out.println(orig + " is NOT a Strong Number");
        }
        sc.close();
    }
}
