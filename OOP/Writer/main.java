import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class main {


    /*
    
          To write a file using Java (4 popular options)

         FileWriter = Good for small or medium-sized text files
         BufferedWriter = Better performance for large amounts of text
         PrintWriter = Best for structured data, like reports or logs
         FileOutputStream = Best for binary files (e.g., images, audio files

         
    */
    public static void main(String[] args) {

  
        
        String filePath = "test.txt";
        String textContent = """
               The beauty of her face was beyond my wildest dreams
               Like cherry blossoms blooming in the mountain in the early spring
               As we walked by the river and she softly took hold of my hand
               That's when I fell deep in love with the girl made in Japan
                """;

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }
    }
}