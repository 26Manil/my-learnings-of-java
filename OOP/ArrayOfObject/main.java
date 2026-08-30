package ArrayOfObject;

public class main {
    public static void main(String[] args) {

        
        Car[] cars = { new Car ("BMW","Black"),
                       new Car ("Mustang","Blue"),
                        new Car ("Porshe","Red") };
         for(Car car : cars){
            car.drive();
         }
         
    }
    
}
