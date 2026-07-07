import java.util.Random;
public class random {
    public static void main(String[]args){

        /*this program is written for genrating a random variable .
        Here we have genrated random number in a particular range using int,double 
        and used boolean datatype to genrate true or false  randomly . */


        Random random = new Random();

    Boolean coin;
    coin = random.nextBoolean();
    System.out.println(coin);
    

    int number;
    number = random.nextInt(0,5001);
    System.out.println(number);

    double n2; 
    
    //n2 = number 2
    n2 = random.nextDouble(0,10001);
    System.out.println(n2);



}
}
