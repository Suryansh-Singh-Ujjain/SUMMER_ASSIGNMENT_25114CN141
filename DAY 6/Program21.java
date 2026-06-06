import java.util.Scanner;
public class Program21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        int bin = 0;
        int p = 1;
        while (num > 0) {
            int rem = num % 2;
            bin= bin + (rem * p);
            p = p * 10;
            num = num / 2;
        }
        System.out.println("Binary number = " + bin);
        sc.close();
    }
}
