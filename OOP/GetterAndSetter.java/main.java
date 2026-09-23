
public class main {

    /*


    GETTERS = Methods that make a feild redable
    SETTERS = Methods that make a feild writable

    They help to protect object data and rules from accesing or modifying them
    write private before variable so it can't change diractly from object 
    ex :
    private String color = black;

    use this for more sequrity
in Car class
    private final String model;

    in main file
    Car car = new Car("BMW","BLUE",5000000);
    
    

    */


    public static void main (String[] args){
        Car car = new Car("BMW","BLUE",5000000);
        car.setColor("RED");
        car.setPrice(-40000);
        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());



    }

    
}
