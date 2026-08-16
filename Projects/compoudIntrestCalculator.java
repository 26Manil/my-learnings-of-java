import java.util.Scanner;

public class compoudIntrestCalculator {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        double principal;
        double rate;
        int years;
        int timeCompound;
        double amount;
        System.out.print("Enter the principal amount in dollars : ");
        principal = scanner.nextDouble();
        System.out.print("Enter the intrest rate on it in percentages : ");
        rate = scanner.nextDouble();
        System.out.print("Enter the number of time it compounds per year : ");
        timeCompound = scanner.nextInt();
        System.out.print("Enter the number of the years you wanna compound it : ");
        years = scanner.nextInt();
        
        rate = rate / 100;

         amount = principal* Math.pow(1 + rate / timeCompound,timeCompound * years);


    
        System.out.println("your amount after " + years + " is " + amount +"$" );
        scanner.close();





    }
    
}
