package methodOverriding;

public class main {


    /*
    
    When a subclass provides its own implementation of a method that is already
    defined ,allowes the code reausablity and give specific implementation


    */
    
public static void main(String[] args) {
    
    dog dog = new dog();
    bird bird = new bird();
  dog.moves();
  bird.moves();

}

}
