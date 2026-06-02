import java.util.Scanner;
public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int pro = 1;
        while (num != 0) {
            int d = num % 10;
            pro = pro * d;
            num = num / 10;
        }
        System.out.println("Product of digits = " + pro);
        sc.close();
    }
}
