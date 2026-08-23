import java.util.Scanner;
public class quizGame {
    public static final String GREEN ="\u001B[32m";
    public static final String RED ="\u001B[31m";
    public static final String YELLOW ="\u001B[33m";
    public static final String RESET ="\u001B[0m";
    public static void main(String[] args) {
        
        String[] questions ={"Who is iron man",
                            " who is spiderman",
                            "who is sitting in tempral loom in marvel"};
        String [][] options = {{"1.Toney Stark","2.Steve Rogers","3.Norman Osbond"},
                                {"1.Danny Rand","2.Peater Parker","3.Harry Osbond"},
                                {"1.Loki","2.Miles Morales","3.Odin"}};

        int[] ans = {1,2,1};

        
        int points = 0;
        int guess ;
        String Enter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcom to Marvel Quiz. \nWrit "+GREEN +"ENTER"+ RESET+"\nto enter the quiz ");
        Enter = scanner.nextLine().toUpperCase();
        

        for(int i = 0; i <questions.length ; i++){
            System.out.println( RESET + questions[i]);


            for(String option : options[i]){

                System.out.println(RESET + option);}
                System.out.println(GREEN + "Enter the number of the selected option");
                guess =scanner.nextInt();
                
            
                if(guess == ans[i]){
                      System.out.println(GREEN +"you are correct");
                    points++;
                }
                else{
                    System.out.println(RED +"you are incorrect");
                }
                System.out.println( YELLOW +"YOUR  POINTS ARE " + points +" OUT OF " + questions.length);
                   
                
                

            }
            scanner.close();
        }


    }
    

