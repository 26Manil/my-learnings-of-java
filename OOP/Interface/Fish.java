package Interface;

public class Fish implements Prey, Predator {
    @Override
    public void flee(){
    System.out.println("THE FISH FLEE");
    }
    
    @Override
    public void hunt(){
    System.out.println("THE FISH IS HUNTING");
    }
}
