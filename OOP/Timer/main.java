import java.util.Timer;
import java.util.TimerTask;
public class main {
    public static void main(String[] args) {

        /*
        
         Timer = Class that schedules tasks at specific times or periodically
                       Useful for: sending notifications, scheduled updates, repetitive actions

         TimerTask = Represents the task that will be executed by the Timer
                                You will extend the TimerTask class to define your task
                                Create a subclass of TimerTask and @Override run()


        */

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){

            @Override
            public void run(){
                System.out.println("Hello!");
            }
        };

        timer.schedule(task, 0, 1000); // (task, delay, period)

    }
}
