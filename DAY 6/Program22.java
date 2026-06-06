
import java.util.Scanner;
public class Program22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int bin = sc.nextInt();
        int dec = 0;
        int base = 1;
        while (bin > 0) {
            int d = bin % 10;
            dec = dec + (d * base);
            base = base * 2;
            bin = bin / 10;
        }
        System.out.println("Decimal number = " + dec);
        sc.close();
    }
}