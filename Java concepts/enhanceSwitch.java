public class enhanceSwitch {

    public static void main(String[] args){

        // When we have to many cases to handel we use enhances swiched
        //  rather then if else statments.


        String day = "Tuesday";

        switch(day){


            case "Sunday"     -> System.out.println("This is week day");
            case "Monday"     -> System.out.println("This is week day"); 
            case "Tuesday"    -> System.out.println("This is week day"); 
            case "Wednesday"  -> System.out.println("This is week day"); 
            case "Thusday"    -> System.out.println("This is week day"); 
            case "Friday"     -> System.out.println("This is weekend ");
            case "Satday"     -> System.out.println("This is weekend ");  
            default           -> System.out.println("This isn't a day ");
        

        }



    }
    
}
