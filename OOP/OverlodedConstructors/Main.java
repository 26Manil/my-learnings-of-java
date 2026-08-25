package OverlodedConstructors;


/*
Overloded Constructors :
Allows aa class to have multiple constructor with diffrent parameters 
lists enable objects to be initilize in various manner.
*/
public class Main {
    public static void main(String[] args){
        UserClass userClass1 = new UserClass("MANIL");
        UserClass userClass2 = new UserClass("MANIL","anything@gmail.com");

        System.out.println(userClass1.username);
        System.out.println(userClass1.email);
         System.out.println(userClass1.age);

         System.out.println("______________________");
          System.out.println(userClass2.username);
        System.out.println(userClass2.email);
         System.out.println(userClass2.age);
         System.out.println("______________________");

    }
    
}
