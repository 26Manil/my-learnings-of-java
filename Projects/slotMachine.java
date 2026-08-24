import java.util.Random;
import java.util.Scanner;
public class slotMachine {
    public static void main(String[] args) {
        
        int balance;
        int bet;
        int payoff;
        String [] row;
        String playAgain;
        Scanner scanner = new Scanner(System.in);
        System.out.println("*********************");
        System.out.println("WELCOM TO THE GAME");
        System.out.println(" SYMBOLS = 🌹,💖,💵");
        System.out.println("*********************");
        System.out.println("Enter your balance");
        balance = scanner.nextInt();
        while(balance > 0){
            System.out.println("CURRENT BALANCE " + balance);
            System.out.println("ENTER THE BET AMOUNT");
            bet = scanner.nextInt();
            scanner.nextLine();
            if(balance < bet){
                System.out.println("INSUFFICENT BALANCE");
                continue;
            }
            else if(balance < 0 ){
                System.out.println("BET SHOULD BE MORE THEN 0");
                continue;
            }
            else{
                balance-= bet;
            }
            System.out.println("Spinning......");
            row = spinRow();
            printRow(row);
           
            payoff = getpayoff(row,bet);

        if(payoff > 0){
            System.out.println("YOU WON " + payoff);
            balance+= payoff;
          

        }else{
            System.out.println("you lost the bet");
           
        }
       System.out.println("DO YOU WANNA PLAY AGAIN (YES/NO)");
            playAgain = scanner.nextLine().toUpperCase();
        if(!playAgain.equals("YES")){
            
            break;
        }
        
        

    }System.out.println("GAME OVER!! YOUR FINAL BALANCE IS " + balance);
        scanner.close();
    


    }
    static String [] spinRow(){
        String []symbols = {"🌹","💖","💵"};
        String [] row = new String[3];

        Random random = new Random();
        for(int i= 0 ; i <3 ; i++){

            row[i] = symbols[random.nextInt(symbols.length)];
        
        }
        return row;


    }
    
        
    static void printRow( String[]row ){
     System.out.println(" "+ String.join(" | ", row));
        
    }


    static int getpayoff(String[] row, int bet){
    if(row[0].equals(row[1]) && row[1].equals(row[2])){
        return switch(row[0]){

            case "🌹" -> bet *3;
            case "💖" -> bet *10;
            case "💵" -> bet * 20;
            default -> 0;
        };
        }
       else if(row[0].equals(row[1]) ){
        return switch(row[0]){

            case "🌹" -> bet *2;
            case "💖" -> bet *5;
            case "💵" -> bet * 10;
            default -> 0;
        };
        }
        else if(row[1].equals(row[2]) ){
        return switch(row[0]){

            case "🌹" -> bet *2;
            case "💖" -> bet *5;
            case "💵" -> bet * 10;
            default -> 0;
        };

        
    }
    return 0;
    }
}
    
    

