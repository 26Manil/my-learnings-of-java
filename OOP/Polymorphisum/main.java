package Polymorphisum;

public class main {
    /*
    
    Polymorphisum =
    poly = many , morph = same .
    Objects can identify as other object 
    object can be treated as objects of objects of common super class


    */

    public static void main(String[] args){
         Car car = new Car();
    Bike bike = new Bike();
    Boat boat = new Boat();
    Vehicle[] vehicles = {car,bike,boat};
    

    for(Vehicle vehicle : vehicles){
        vehicle.go();
       
    }
    }

}
