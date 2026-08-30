package Static;

public class Friend {
    static int numOfFriends;
    String name;

    Friend(String name){

        this.name = name;
        numOfFriends++; }

    static void showFriend(){
        System.out.println("YOU HAVE " + numOfFriends + " TOTAL FRIENDS");

    }
       
    
}
