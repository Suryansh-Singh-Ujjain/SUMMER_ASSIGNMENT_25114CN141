import java.util.Scanner;
public class Program20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int LPF = 1;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                int flag = 0;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    LPF = i;
                }
            }
        }
        System.out.println("Largest Prime Factor = " + LPF);
        sc.close();
    }
}
