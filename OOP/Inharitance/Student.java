package Inharitance;

public class Student extends person{
    double gpa;
    Student(String first,String last,double gpa){

        super(first,last);
        this.gpa = gpa;

    }
    void showGPA(){

        System.out.println(this.first +" " + this.last + " 's GPA " + gpa);
    }    
}
