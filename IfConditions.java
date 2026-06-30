import java.util.Scanner;

public class IfConditions {
    public static void main(String[] args) {

        String name;
        int age;
        boolean isStudent = false;


       System.out.print("enter yout name ");
          Scanner scanner = new Scanner(System.in);
       name = scanner.nextLine();

        System.out.print("enter your age :");
        age = scanner.nextInt();

System.out.print("Are you a Student(true/false) :");
        isStudent = scanner.nextBoolean();
   
        //name 
       

           if(name.isEmpty()){
            System.out.println("you didn't enter your name");
    }
    else{
        System.out.println("your name is " + name );


        //age

        System.out.print("accoding to your age ");
        if (age >= 65) {
            System.out.println("You are a senior.");
        }else if (age >= 18) { 
                System.out.println("You are an adult.");
            }
               else if (age <= 18) { 
                System.out.println("You are an minor.");
              }
            
// Is the user student


if(isStudent){
    System.out.print("You are a student");
}
else{
    System.out.println("You are not a student");
}
         
    }
         scanner.close();
    }
}

