package Interface;

public class main {

    /*
    
    Interfaces  = A blueprint for class that specifies a set of abstract method 
                  that implementing classes must be defined.
                  (suppors multiple inharitance like behaviour)


    */
    



     public static void main (String [] args ){

        Rabbit rabbit = new Rabbit ();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        hawk.hunt();
        rabbit.flee();
        fish.hunt();
        fish.flee();








      }





}
