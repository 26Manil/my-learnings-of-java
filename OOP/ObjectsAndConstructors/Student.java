package ObjectsAndConstructors;

public class Student {

    String name;
    int age;
    double gpa;
    
    
    public Student(String name,int age,double gpa){

        this.name = name;
        this.age = age;
        this.gpa = gpa;


    }
    void Study(){
        System.out.println(this.name + " is Studying");

    }
}

