public class loopPart2 {
   


    public static void main(String [] args){

        //break = stops the loop over there
        //continew = skips the part of loop

        for(int i = 0; i<10;i++){

            if(i==5){

                continue;
            }
            System.out.println(i + " ");
        }

        //nested loop = A loop inside loop
        for(int i = 1; i<3 ; i++){
            for(int j =10 ; j <= 20; j++){

                System.out.println( j + " ");
            }
        }

    }
    
}
    

