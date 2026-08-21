import java.util.Scanner;
public class bankingProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double balance = 10000000;
        boolean isRunning = true ;
        int choise ;

        while(isRunning){

            System.out.println("--------------------");
            System.out.println("   Banking Program  ");
            System.out.println("--------------------");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw amount ");
            System.out.println("4.Exit");
            System.out.println("--------------------");
            System.out.println("Please Enter 1-4");
            choise = scanner.nextInt();

            switch(choise){
                case 1   -> showBalance(balance);
                case 2   -> balance = balance + deposit();
                case 3   -> balance = balance - withdraw(balance); 
                case 4   -> isRunning = false;
                default  -> System.out.println("Invalid choise");


            }

             scanner.close();

        }

        System.out.println("Thank for visiting");
        scanner.close();
    }
    static void showBalance(double balance){
        System.out.printf("Your balance is %2f",balance);
         
    }

    
    static double  deposit(){

        double amount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the amount to be deposited ");
        amount = scanner.nextDouble();
         scanner.close();
        if(amount < 0){
            System.out.println("invalid amount");
            return 0;
        }
        else{
            return amount;
            
        }


       


    }
 
    static double withdraw(double balance){

        Scanner scanner = new Scanner(System.in);

        double amount;
        System.out.println("Enter the amount to be  withdraw");
        amount = scanner.nextDouble();
         scanner.close();
        if(amount < 0){
            System.out.println("Amount is invalid");
            return 0;
        }else if(amount > balance){
            System.out.println("insufficent balance ");
            return 0;
        } else{
           return  amount;
        }


    }
    
    
        
    
    
    
}
