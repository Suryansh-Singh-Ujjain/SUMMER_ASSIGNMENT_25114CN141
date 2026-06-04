import java.util.Scanner;
public class Program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int orig = num;
        int sum = 0;
        while (num != 0) {
            int d = num % 10;
            sum = sum + (d * d * d);
            num = num / 10;
        }
        if (sum == orig) {
            System.out.println(orig + " is an Armstrong Number");
        } else {
            System.out.println( orig + " is NOT an Armstrong Number");
        }
        sc.close();
    }
}
