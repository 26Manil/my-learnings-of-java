import java.util.Scanner;
public class tempreatureConverter {

    public static void main(String[] args){




    double temp;
    double newTemp;
    String unit;

    Scanner scanner = new Scanner (System.in);
    
    System.out.println("in wich unit do you want your tempreature celsius  or Faherenhite?(C or F) : ");
    unit = scanner.nextLine().toUpperCase();
    System.out.println("Enter your tempreature");
    temp = scanner.nextDouble();

   
    newTemp = (unit.equals("C"))?   (temp - 32) *5/9 : (temp * 5/9) + 32;

    System.out.printf("%2f%s",newTemp,unit);
    scanner.close();






    }
    
}
