public class ArithmeticOperators {
    public static void main(String[]arg ){

        //ArithmeticOperators
        int X = 10;
        int Y = 2;
        int Z;
        

        //Z = X + Y;
        //Z = X - Y;
        //Z = X * Y;
        //Z = X / Y;
        //Z = X % Y;

        Z = X + Y;
        System.out.println(Z);

        //Argument Assiment Operators
        int A = 10;
        int B = 5;

         //A -= B;
         //A += B;
         //A *= B;
         //A /= B;(use DOuble to obtain the decimal part)
         

         A -= B;
         System.out.println(A);

         // Increament and Decrement operators "++"
         
         int C = 1;
         C++;
         System.out.println(C);

         /* Order of operation [P-E-M-D-A-S]

         P = perenthes
         E = Exponant
         M = Multipication
         D = division
         A = Addition
         S = Substraction
         */
        double result = 3 + 4 *(7-5)%2.0;
        System.out.println(result);



    }
}
