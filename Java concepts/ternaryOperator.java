public class ternaryOperator {

    public static void main(String[]args){

        /*
        Ternary operator? = returns 1 of 2 value if a condition is true 

        variable = (condition)? ifTrue : ifFalse

    
        */
    
        double marks = 70;

        String passOrFail = (marks >= 40)? "Passed" : "Failed";
        System.out.println("you are " + passOrFail);



    }
    
}
