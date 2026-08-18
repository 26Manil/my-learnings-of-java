import java.util.Scanner;

public class Calculator { 
  // basic calculator
  public static void main(String[] args){

        double numb1;
        double numb2;
        char oprator;
        double result=0;
        boolean validOper = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        numb1 = scanner.nextDouble();
        System.out.println("chose one for your operation (+,-,*,/,^)");
        oprator = scanner.next().charAt(0);
        System.out.println("Enter your secound nummber");
        numb2 = scanner.nextDouble();

        switch(oprator){

            case '+' -> result = numb1 + numb2;
            case '-' ->result = numb1 - numb2;
            case '*' -> result = numb1 * numb2;
            case '/' -> { 
              if(numb2 == 0){

                System.out.println("cannot divide by zero");
                validOper = false;
              }
              else{
                result =numb1/numb2;
              }

            }
            case '^' -> result = Math.pow(numb1,numb2);
          default -> {
            System.out.println("invalid operator");
          }
            }if(validOper){System.out.println(result);}
            

   
        
      

      scanner.close();

    


        }
        }
      

    