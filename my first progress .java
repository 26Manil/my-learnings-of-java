
import java.util.Scanner;

public class MyFirstProgress {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter your name: ");
            String name = scanner.nextLine();
            
            System.out.println("Please enter your age: ");
            int age = scanner.nextInt();
            
            System.out.println("Enter your JEE rank: ");
            double rank = scanner.nextDouble();
            scanner.nextLine(); // Clear buffer
            
            System.out.println("Which is your strongest subject: ");
            String subject = scanner.nextLine();
            
            System.out.println("Are you choosing to give up (true/false): ");
            boolean givingUp = scanner.nextBoolean();
            
            System.out.println("\nYou are " + name + " and you are " + age + " years old with rank " + rank
                + " and your strong subject is " + subject + ".\n"
                + "You may feel exhausted, but running away won't fix it.\n");
            
            if (givingUp) {
                System.out.println("Please don't give up!");
            } else {
                System.out.println("Keep moving forward—you're on the right path!");
            }
        }
    }
}
