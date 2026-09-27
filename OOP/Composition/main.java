public class main {
     /*
     
     Composition : Represent a part of relationship between objects 
                   for example an engine is is "part-of" a Car. allows 
                   complex object to be constructed from smaller object .

     */
  public static void main (String [] args){
    Car car = new Car("lamborghini Revuelto ", 2025, "V12");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();
    }
                 
}