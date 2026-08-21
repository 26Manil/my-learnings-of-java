import  java.util.Arrays;
public class array {

    public static void main(String[] args) {
        /*
        
        array = a collection of values of same data type
        (Think of it as a variable that can store more then one value.)
        eg :- 
        String[]fruit = {"apple"};
        
        */
        String[]fruits = {"apple", "orange" ,"banana"};
        String[]fruit = {"apple", "orange" ,"banana"};
        System.out.println(fruits[0]); // here 0 is thre index number

   // fruits[0] ="pinaple";
    int numbOfFruits = fruits.length;
    Arrays.sort(fruits);
    Arrays.fill(fruit,"berrys");
   

    for( String fruiit : fruits){

         System.out.println(fruits[0]);
         System.out.println(fruits[1]);
           System.out.println(fruits[2]);
        System.out.println(fruit[0]);
        System.out.println(fruit[1]);
        System.out.println(fruit[2]);

    }
       
    
   
   


     
    }

    
    
}
