import java.util.Scanner;
public class searchAnArray {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

       
        String[] fruits = {"APPLE","BANANA","ORANGE"};
       boolean isFound = false;
        String target;
        
        System.out.println("enter the fruit location you want");
         target = scanner.nextLine().toUpperCase();
        

         
       
           for(int i = 0; i < fruits.length ; i++){
            if(fruits[i].equals(target)){
                System.out.println("Element foud at index " + i);
                isFound = true; 
                break;
            }
            else{
                System.out.println("element not found");
            }

            
          


            scanner.close();
           }
            

        



      
    }
    
}

