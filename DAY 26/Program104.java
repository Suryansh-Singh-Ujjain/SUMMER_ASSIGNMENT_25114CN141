import java.util.Scanner;
public class Program104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int answer;
        System.out.println("=== Java Quiz Application ===");
        System.out.println("\n1. Which keyword is used to create an object in Java?");
        System.out.println("1. class");
        System.out.println("2. new");
        System.out.println("3. object");
        System.out.println("4. this");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();
        if (answer == 2) {
            score++;
        }
        System.out.println("\n2. Which method is the entry point of a Java program?");
        System.out.println("1. start()");
        System.out.println("2. run()");
        System.out.println("3. main()");
        System.out.println("4. execute()");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();
        if (answer == 3) {
            score++;
        }
        System.out.println("\n3. Java is a:");
        System.out.println("1. Programming Language");
        System.out.println("2. Operating System");
        System.out.println("3. Database");
        System.out.println("4. Browser");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();
        if (answer == 1) {
            score++;
        }
        System.out.println("\n=== Quiz Result ===");
        System.out.println("Your Score: " + score + "/3");
        sc.close();
    }
}
