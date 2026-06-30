
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        // Getting my hands on Java Scanner for the first time!
        // This little program asks who you are, where you stand in JEE,
        // and reminds you that giving up was never really an option.
        // learning how to accept user input through different variables
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your name ");
        String name = scanner.nextLine();
        System.out.println("please enter your age ");
        int age = scanner.nextInt();
        System.out.println(" enter your jee rank");
        double rank = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("which is your strongest subject ");
        String Subject = scanner.nextLine();

        System.out.println("are you choosing to give up(true/false)  ");
        boolean alive = scanner.nextBoolean();
        System.out.println(" You are " + name + " and you are " + age +" years old and your rank is  " + rank
      + " and you have " + Subject + " as a strong subject \n you may feel exhausted from this all but,\n running away from it will never fix it, so if it is "  );

        if(alive){
            System.out.println(" true then ,please don't give up");
        }
        else{
        System.out.println(" false , then keep moving forward, you are on right path" );

    }

        scanner.close();
    }
}

