package OverlodedConstructors;

public class UserClass {
    String username;
    String email;
    int age;

   UserClass(String username){
        this.username = username;
        this.email = "not provided";
        this.age = 18;
    }
     UserClass(String username,String email){
        this.username = username;
        this.email = email;
        this.age = 18;
     }
     // SAme constructor but diffrent parameters in constructor
}
