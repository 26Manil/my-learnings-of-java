package Abstraction;

public class Circle extends Shape {


    double radius;
       Circle(double radius){
        this.radius = radius;
    }
    @Override
     double area(){
        return Math.PI * radius; // should be written in every children class
    }
    
}
