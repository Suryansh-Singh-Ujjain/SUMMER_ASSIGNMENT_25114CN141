import java.util.Scanner;
public class Program94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String compressed = "";
        int c = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                c++;
            } else {
                compressed += str.charAt(i);
                compressed += c;
                c = 1;
            }
        }
        System.out.println("Compressed string: " + compressed);

        sc.close();
    }
}

