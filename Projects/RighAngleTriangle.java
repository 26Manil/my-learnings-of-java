
import java.util.Scanner;

public class RighAngleTriangle {
    public static void main (String []args){



     // This program helps to find the hypotaneous of right angle triangle 
     // Formula = H = √(P² + B²)

     double P;
     double B;
     double H;
     
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter the lenght of Perpendicula side of Triangle");
      P = scanner.nextDouble();

     System.out.println("Enter the lenght of Base side of Triangle");
      B = scanner.nextDouble();

      H = Math.sqrt(Math.pow(P,2) + Math.pow(B,2) );
      System.out.println("Hypotaneous of the triangle is " + H);

      scanner.close();

     



    }
    
}
