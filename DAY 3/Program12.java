import java.util.Scanner;
public class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int max = (num1 > num2) ? num1 : num2;
        int lcm = max;
        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                break;
            }
            lcm++;
        }
        System.out.println("LCM = " + lcm);
        sc.close();
    }
}
