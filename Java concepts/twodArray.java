public class twodArray {

    public static void main(String[] args) {
        //2D array = an array where elements in it is array
        // this is usefull for matrix of data

        String [][] grocerries = {{"apples ", "oranges" , "banana"},
                                  {"patato ", "garlic" , "onion"},
                                  {"oats", "milk" , "paneer"}  };
                                                            
          // String [// this one is for rows][// this one is for columns]
          // to replce use   grocerries[2][3] = "//CARROT";
          
           grocerries[1][1] = "tomato";
          for(String [] foods : grocerries){
            for(String food : foods){
           System.out.println(food + " ");}
          }
    }
    
}
