public class varge {

    /*
    
    Varge = allows a method to accept  a varying  # of argument
    to make methods more flexible, no need for 
    overload method .java  will pack
     the argument into  an 
     array

    */
    public static void main(String[] args) {
        System.out.println(avarage(1,2,2,2,4,5,6,7));
    }
    static double avarage(double... numbers){
        double sum =0;
        if(numbers.length == 0){
            return 0;
        }
        for(double number : numbers){
            sum += number;
        }

        return sum / numbers.length;
    }
}
