import java.util.Scanner;

public class cart {
    public static void main(String[] args)
    // shopping cart program
    // designed to calculate the prise of your order
    {
        Scanner scanner = new Scanner(System.in);
        String order;
        int quantity;
        double prise;
        double total;
        String currency;
        currency = "rupees";


        System.out.println("what is your order : ");
        order = scanner.nextLine();
        System.out.println("prise of " + order + " is : ");
        prise = scanner.nextDouble();
        System.out.println("how much do you want? :");
        quantity = scanner.nextInt();
        total = quantity * prise;
        System.out.println("so your total would be  : " + total + currency);


        scanner.close();
    }
}