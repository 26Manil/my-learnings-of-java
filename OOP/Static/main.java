package Static;

public class main {

    /*
    Static = Make a variable or method belong to the class rather 
            then to any specific object.commonly used for
             utility methods or share resorces
    */
 public static void main(String[] args){
        
     Friend friend = new Friend("BEN");
     Friend friend2 = new Friend("KEVIN");

     Friend.showFriend();


    }
    
}
