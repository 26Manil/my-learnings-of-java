public class variableScope {

    //  variable Scope = from where a variable can be accessed
    // class =  variable stored outside the method 
    // java prefers local over class mostly 
    // ,but in few case class is prefarable

    static int x =3; //class

    public static void main(String[] args) {
        
        //local = variable stored inside the method 

        int x = 1; //local
        System.out.println(x);
        doSomething();

    }

    static void doSomething(){
      
        System.out.println(x);  
    }
    
}
