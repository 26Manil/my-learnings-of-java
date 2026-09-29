import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class music {

    public static void main(String[] args) {

        // How to PLAY AUDIO with Java (.wav, .au, .aiff)

        Scanner scanner = new Scanner(System.in);
        String filePath ="E:\\java me\\.vscode\\my-learnings-of-java\\Projects\\music player\\She_Him_-_I_Thought_I_Saw_Your_Face_Today_Official_Lyric_Video.wav";
      
        
        File file = new File(filePath);

        try (AudioInputStream rawStream = AudioSystem.getAudioInputStream(file)) {

          
            AudioFormat format = rawStream.getFormat();
            byte[] data = rawStream.readAllBytes();

            AudioInputStream audioStream = new AudioInputStream(
                    new ByteArrayInputStream(data),
                    format,
                    data.length / format.getFrameSize());

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while (!response.equals("Q")) {

                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");

                response = scanner.next().toUpperCase();

                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not locate file");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported");
        }
        catch (LineUnavailableException e) {
            System.out.println("Unable to access audio resource");
        }
        catch (IOException e) {
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("Bye!");
        }scanner.close();
    }
}