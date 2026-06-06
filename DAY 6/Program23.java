import java.util.Scanner;
public class Program23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int c = 0;
        while (num > 0) {
            int rem = num % 2;
            if (rem == 1) {
                c++;
            }
            num = num / 2;
        }
        System.out.println("Number of set bits = " + c);
        sc.close();
    }
}
