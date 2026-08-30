package Inharitance;

public class main {
    public static void main(String[] args){

/* Inharitance = one class inharits the attributes and methods
  of another class 
  parent class -> child class
  grandparents class -> -> parent class 
  grandparents class -> child class

  Super //keyword = Refers to the parent clas (Subclass <- Super class)
                    used in constructors and method overloading
                    calls the parent costrutor

  *** Any argument the parent class requied need 
  to be send though child class***
  */
 person person = new person("Tom","Holand");
 Student student = new Student("Harry","Osbond",4.5);

 student.showGPA();
person.showName();



    }
    
}
