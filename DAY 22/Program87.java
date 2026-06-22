import java.util.Scanner;
public class Program87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Character Frequencies:");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 1;
            boolean visited = false;
            for (int j = 0; j < i; j++) {
                if (ch == str.charAt(j)) {
                    visited = true;
                    break;
                }
            }
            if (visited) {
                continue;
            }
            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }
            System.out.println(ch + " : " + count);
        }
        sc.close();
    }
}