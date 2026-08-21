import java.util.Random;
import java.util.Scanner;
public class dieRollarProgram {


    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numbOfDie;
        int Total =0;
        
      System.out.println("enter the number of die you wanna roll");
      numbOfDie = scanner.nextInt();
       
        if(numbOfDie < 0){
            System.out.println("Invalid Choise");
        }else{
            for(int i = 0 ; i < numbOfDie; i++){

                 int roll = random.nextInt(1,7);
                 printDie(roll);
                System.out.println("You have rolled " + roll);
                Total += roll;

            }System.out.println("Total " + Total);
        }

        scanner.close();

    }

    static void  printDie( int roll){

        String roll1 = """
                ___________
               |           |
               |           |
               |     *     |
               |           |
               |___________|           
                """;
                

                String roll2 = """

                ___________
               |           |
               |     *     |
               |           |
               |     *     |
               |___________|  
                        
                        """;
                        

                        String roll3 ="""
                                
                ___________
               |           |
               |       *   |
               |     *     |
               |  *        |
               |___________|  
                                """;
                               
         String roll4 ="""
                 
                ___________
               |           |
               |  *    *   |
               |           |
               |  *    *   |
               |___________|  
                 """;
                

                 String roll5 = """
                         
                ___________
               |           |
               | *       * |
               |     *     |
               | *       * |
               |___________|  
                         """;
                         

                         String roll6 = """
                                 
                ___________
               |           |
               |  *     *  |
               |  *     *  |
               |  *     *  |
               |___________|  
                                 """;
                                 
        switch(roll){

            case 1 -> System.out.println(roll1);
            case 2 -> System.out.println(roll2);
            case 3 -> System.out.println(roll3);
            case 4 -> System.out.println(roll4);
            case 5 -> System.out.println(roll5);
            case 6 -> System.out.println(roll6); 
            default -> System.out.println("invalid roll");

        }

        

    }
    
}
