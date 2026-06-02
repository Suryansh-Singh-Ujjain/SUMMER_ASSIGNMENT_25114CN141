import java.util.Scanner;
public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int orig = num;
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        if (orig == rev) {
            System.out.println(orig+ " is a Palindrome number");
        } else {
            System.out.println(orig + " is NOT a Palindrome number");
        }
        sc.close();
    }
}

