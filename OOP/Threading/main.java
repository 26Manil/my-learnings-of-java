import java.util.Scanner;
import java.util.Scanner;

public class main {

    /*
    
    Threading = Allows a program to run multiple tasks simultaneously
                               Helps improve performance with time-consuming operations
                              (File I/O, network communications, or any background tasks)

         How to create a Thread
        Option 1. Extend the Thread class (simpler)
        Option 2. Implement the Runnable interface (better)

        
    */
    public static void main(String[] args) {

        

        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true); // This thread will end when Main thread finishes
        thread.start();

        System.out.println("You have 10 seconds to enter your name");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        scanner.close();
    }
}

