import  java.util.Scanner;
public class weightConversionProgram {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double weight;
        double newWeight;
        int choise;
        

        System.out.println("Weight conversion System");
        System.out.println("enter 1 to convert weight from lbs to kgs");
         System.out.println("enter  2 to convert weight from kgs to lbs");
         choise = scanner.nextInt();

         if (choise == 1){
            System.out.println("enter the weight in Lbs for conversion");
            weight = scanner.nextDouble();
            newWeight = weight*0.453572;
            System.out.printf("your new weight is \n %2f kgs",newWeight);
            System.out.println("\nHope you liked It");

         }
         else if (choise == 2) {
            System.out.println("enter the weight in Kgs for conversion");
            weight = scanner.nextDouble();
            newWeight = weight*2.20462;
            System.out.printf("your new weight is \n %2f Lbs",newWeight);
            System.out.println("\nHope you liked It"); 
         }

         else{

            System.out.println("Enter a valid choise");
         }
         




    }
    
}
