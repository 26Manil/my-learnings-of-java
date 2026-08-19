import java.util.Random;
import java.util.Scanner;
public class numberGuessingGame {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guess;
        int attempt = 0;
        int randomNumber = random.nextInt(0,10);

        System.out.println("Guessing game");
        

        do {
            System.out.println("guess a number between 1-10");
            guess = scanner.nextInt();
            attempt++;

            if(randomNumber > guess){

                System.out.println("it is too low, Try again ");
            }else if (randomNumber < guess){

                 System.out.println("it is too High, Try again ");
            
            } else {
                System.out.println("you are correct,You win");
            }
        }while(guess != randomNumber);
 
        scanner.close();

        








    }
    
}
