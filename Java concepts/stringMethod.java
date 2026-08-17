public class stringMethod {
    public static void main(String[]args){

      
        String pokemon = "pikachuu";

        /* 
        I have used above strung as example for input here.

        .length();        -> Gives the lenght of the string
        .CharAt(0);       -> Give the character at particular index of string.
        .indexOf(k);      -> Give the index number at particular character of string.
        .lastIndexOf(u);  -> Gives the last index number of a repeted character in the string
        
        .toUpperCase();
        .toLowerCase();
        .trim();
        .replace (" thing you wanna replace ", "its replacement")

        *****Boolean Methods*****
        .equals()
        .contains()
        .isEmty()
        
        */
        int length = pokemon.length();
        char letter = pokemon.charAt(0);
        int index = pokemon.indexOf("k");
        int lastIndex = pokemon.lastIndexOf("u");

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        // uses of other methods can bee seen in project

        /* 
        .substring(x,y) = A method use to extract exact position of string
        x = the position you wanna start extracting.
        y = the position you wanna end extracting.
    
        */

        String email = "charizard@gmail.com";
        String Username = email.substring(0,email.indexOf('@'));
        System.out.println(Username);


    }
    
}
