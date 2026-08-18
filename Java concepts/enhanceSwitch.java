public class enhanceSwitch {

    public static void main(String[] args){

        // When we have to many cases to handel we use enhances swiched
        //  rather then if else statments.


        String day = "Tuesday";

        switch(day){


            case "Sunday" -> System.out.println("this is weekday");
            case "Monday"  -> System.out.println("this is weekday"); 
            case "Tuesday"  -> System.out.println("this is weekday"); 
            case "Wednesday"  -> System.out.println("this is weekday"); 
            case "Thusday"  -> System.out.println("this is weekday"); 
            case "Friday"  -> System.out.println("this is weekend ");
            case "Satday"  -> System.out.println("this is weekend ");  
            default  -> System.out.println("this isn't a day ");
        

        }



    }
    
}
