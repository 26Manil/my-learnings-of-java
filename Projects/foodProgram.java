import java.util.Scanner;
public class foodProgram {
    
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        String [] foods;
        int size;
        


        System.out.println("how many food items do you want");
        size = scanner.nextInt();
        foods = new String[size];
        scanner.nextLine();

    for(int i= 0; i < foods.length;i++){
        System.out.println("please enter the name of your food iteam");
        foods[i] = scanner.nextLine();
    }

    for(String food : foods){
        System.out.println(food);
    }
    scanner.close()

    
    }
}
