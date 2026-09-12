package Abstraction;

public class main {
    /*
    

    keyword -> Abstract = used to define classed and method abstraction is the process of
                          hiding impleantation details and showing only the essencial 
                          features.Abstract class can't be instansiated diractly 
                          can contain 'abstract' method(wich must be implemented can contains methods 
                          that method can be inharited. )


    */


    public static void main(String [] args ){
     Circle circle = new Circle(88);
     System.out.println(circle.area());
     circle.display();


    }
    

                          
}
