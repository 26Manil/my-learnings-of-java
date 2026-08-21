import java.util.Scanner;
public class logicalOperators {

public static void main(String[] args){

        // && = and 
        // || = or
        // ! = and operator 
        //programe based on it 

        String username;
       

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username : ");
         username =scanner.nextLine();

        
            

        if(username.length() < 4 || username.length() > 12){
            System.out.println("The username should be between 4-12 charaters");
        }
        else if(username.contains(" ") || username.contains("_")){

            System.out.println("the user name should not have underscores and spaces");
        }
        else{

        System.out.println("welcome "+ username);
        
        boolean isSunny = false;

        double temp = 23;
        
         if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The wheather is nice");
            System.out.println("The wheather is sunny ");
         }
         else if (temp <= 30 && temp >= 0 && !isSunny){

             System.out.println("The wheather is nice");
            System.out.println("The wheather is cloudy");
            

         }

         else{
            System.out.println("the wheather is cazy");
         }
        }

        scanner.close();


    }    
    
}
