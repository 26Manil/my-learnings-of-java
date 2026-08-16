public class PrintfStatment {
    public static void main(String[] args){

        /*
        
        printf() = is a method used to formate output.
        %[flags][width][precision][specifier charater]

        %s -> string
        %d -> integer
        %f -> double
        %b -> boolean
        %c -> charater
    
        */
       String name = "Charizard";
       char firstName = 'C';
       int age = 15;
       double hight = 170;
       Boolean isCaughed = true;

       System.out.printf("Pokemons name is %s  \n the first letter of his name is %c \n his age is %d \n his hight is %f and \n he is caughed in Pokeball is %b",name,firstName,age,hight,isCaughed);

       /*
       
       note : if we put .X (here X could be any number  0 to infinity)
       So it will display that much numbers after decimal point.
       For example this statment 
       %2f (it will display 2 numbers after the decimal point)

       after percent sign
       [flags]
        + -> This output a plus
        - -> comma grouping seprators
        ( -> negetive numbers are enclose in() .
           -> space is used to display - if the number is negetive ,
            space if number is positive
           
            %0Xd  (hre X = the amout of charater in number)
        This will print the X numbers of width for your integer
         the remanig space will be filled with zeros in starting

         But if we write  %-Xd then it will print space insted of 0
    
       */

         // Demonstrating an example 
         int A = 4879;
         
       
          System.out.printf("The number is %8d\n",A);
          System.out.printf("The number is %08d\n",A);
           int B = 48;
           int C = 489;
           int D = 4896;
           int E = 48965;
          System.out.printf("%-9d\n",B);
          System.out.printf("%-9d\n",B);
          System.out.printf("%-9d\n",C);
          System.out.printf("%-9d\n",D);
          System.out.printf("%-9d\n",E);






    





    }
    
}
