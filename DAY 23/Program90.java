import java.util.Scanner;
public class Program90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char result = '\0';
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    result = str.charAt(i);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (found) {
            System.out.println("First repeating character: " + result);
        } else {
            System.out.println("No repeating character found.");
        }
        sc.close();
    }
}
