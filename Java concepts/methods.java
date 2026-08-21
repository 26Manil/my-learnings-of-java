import java.util.Scanner;
public class methods {

    //method = a block of reusable code that is executed when called
    // () = after argument this is used to pass agument

    public static void main(String[] args) {
        
    int age;
    System.out.print("Enter your age ");
    Scanner scanner = new Scanner(System.in);
    age = scanner.nextInt();
    if(ageCheck(age)){
        System.out.println("you are signed up");
    }else{
        System.out.println("you must be 18 or more");
    }



    //overload method = method shares same name but diffrent parameters 
    // signature = name + parameter
   

    System.out.println(add(1,2,2));
    scanner.close();
    }

    static boolean ageCheck(int age){

        if(age >=18){
            return true;
        }else{
            return false;
        }

    }
    static double add(double a , double b){

        return a + b;

    }

    static double add(double a , double b,double c){

        return a + b + c;

        
    }
        
    


    
}