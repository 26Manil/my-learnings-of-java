import java.util.Scanner;
public class nestedIfElseStatments{
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        



        // nested if else statment = using if and else statment using inside a if alse statment 
        // here senior can be any older person and is not requiered to be student for senior discount



        boolean isStudent ;
        boolean isSenior ;
        double prise = 9.99;

        System.out.println("Are you a student(true/false)");
        isStudent = scanner.nextBoolean();
        System.out.println("Are uou a senior (true/false)");
        isSenior = scanner.nextBoolean();


        if(isStudent){
            if(isSenior){
                System.out.println("you get student discount of 10%");
                System.out.println(" and a senior discount of 20%");
                prise *= 0.7;

            
            }

        else {
            System.out.println("you get a student discount of 10%");
        prise *= 0.9;
        }
    
}
    

        else{
            System.out.println("you get an senior discount of 20% ");
            prise *= 0.8;
        }
        
        

        
        
       System.out.printf("the price of a tickit is $ %2f ",prise);
       scanner.close();







    }
    
}
