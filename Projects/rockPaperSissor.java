import java.util.Random;
import java.util.Scanner;
public class rockPaperSissor {


    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String [] choise = {"ROCK" , "PAPER","SISSOR"};
        String player;
        String computer;
        String isPlaying = "YES";

        do{
            System.out.println("ENTER YOUR MOVE");
            player = scanner.nextLine().toUpperCase();

            if(!player.equals("SISSOR") && !player.equals("ROCK") && !player.equals("PAPER")){
                System.out.println("INVALID INPUT");
                continue;
                
            }
            computer = choise[random.nextInt(3)];
            System.out.println("COMPUTER CHOISE : " + computer);
         if(player.equals(computer)){
            System.out.println("THE GAME IS TIED");
         }
         else if(player.equals("ROCK") && computer.equals("SISSOR") ||
                 player.equals("SISSOR") && computer.equals("PAPER")||
                player.equals("PAPER") && computer.equals("ROCK")){
                 System.out.println("YOU WIN!!! COMPUTER SELECTED " + computer );
                }
        else{
            System.out.println("YOU LOST..... COMPUTER SELECTED "+ computer ) ;
                
            

        }
    }while(isPlaying.equals("YES"));
    System.out.println("THANKS FOR PLAYING");

    scanner.close();
    
}
}
