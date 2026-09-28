public class Parse {
    
  
    public static void main(String[] args) {

        

        
        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        char c = "Pizza".charAt(0);
        boolean d = Boolean.parseBoolean("false");
   
        String x = "" + a + b + c + d;
        System.out.println(x);
        // other methods 

        char Letter = 'B';
        System.out.println(Character.isLetter(Letter));
         System.out.println(Character.isUpperCase(Letter));
    }
}

