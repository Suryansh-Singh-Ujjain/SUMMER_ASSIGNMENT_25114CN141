import java.util.Scanner;
public class Program93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        if (str1.length() != str2.length()) {
            System.out.println("Strings are not rotations.");
        } else {
            String temp = str1 + str1;
            if (temp.contains(str2)) {
                System.out.println("Strings are rotations.");
            } else {
                System.out.println("Strings are not rotations.");
            }
        }
        sc.close();
    }
}