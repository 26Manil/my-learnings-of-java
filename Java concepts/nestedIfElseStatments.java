
import java.util.Scanner;

public class nestedIfElseStatments {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);



        // Nested if else statment = using if and else statment using inside a if alse statment 
        // Here seniors means every senior regardless of being a student
    


        boolean isStudent;
        boolean isSenior;
        double prise = 9.99;
        System.out.println("are you a student");
        isStudent =scanner.nextBoolean();
        System.out.println("are you a senior");
        isSenior = scanner.nextBoolean();

        if(isStudent){
            if(isSenior){
                System.out.println("you get student discount of 10%");
            
                System.out.println(" and a senior discount of 20%");
                
                prise *= 0.7;
            }
            else{
                System.out.println("you get a students discount");
                prise *= 0.9;

            }
        }

        else {
            System.out.println("you get a student discount of 10%");
        prise *= 0.9;
    }

        
        
       System.out.printf("the price of a tickit is $ %2f ",prise);
       scanner.close();







    }
    
}
