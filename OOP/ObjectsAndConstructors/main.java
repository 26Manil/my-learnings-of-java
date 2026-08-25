package ObjectsAndConstructors;
public class main{



    public static void main(String[]args){


        /*  
        
        Object = An entity that holds data (attributes)
         and can perform action (methods), It is a refrence data type

         . = dot oprater allows us to use dta in object
        eg
         Car car = new Car();


         Constructor in java :
         A special method to initialize object, you can pass argument to a constructor 
         to sent up the initial values

        */

         Student student = new Student("MANIL",18,8);

         System.out.println(student.name);
         System.out.println(student.age);
         System.out.println(student.gpa);


         student.Study();



      









    }
    
}
