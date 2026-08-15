import java.util.Scanner;

public class scanner {

    public static void main (String []args){

        String name;
        int age;


Scanner scanner = new Scanner(System.in);{




System.out.println("enter your name ");
name = scanner.nextLine();

System.out.println(" enter your age");
age = scanner.nextInt();

System.out.println("you are " + name + ".\n you are " + age + "years old ");

scanner.close();

    }
}

}
    
