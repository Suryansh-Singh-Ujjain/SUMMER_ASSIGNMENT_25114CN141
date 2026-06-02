import java.util.Scanner;
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int c = 0;
        int temp = num;
        while (temp != 0) {
            temp = temp / 10;
            c++;
        }
        System.out.println("Number of digits = " + c);
        sc.close();
    }
}
