import java.util.Scanner;
public class loops {

public static void main(String [] args){

// while loop = this loop repeats some code forever,
// while some condition remains true 

Scanner scanner = new Scanner(System.in);

String name ="";

while(name.isEmpty()){

    System.out.println("please enter your name ");
    name = scanner.nextLine();
}

System.out.println("Hello " + name );


// do while loop = it first do the following condition first
//  and then check arguments in while 

String weather = " ";

do{
    
    System.out.println("how is the weather");
    weather = scanner.nextLine();
}while(weather.isEmpty());


System.out.println("So the whether is " + weather);

// For loop = executes some code for a certian amount of time .
 int max;
System.out.println("how many time you wanna sing(type) Happy birth day");
max = scanner.nextInt();

for(int i = 1 ; i <= max ; i++){

    System.out.println("happy birthday");


}


// happy birthday program

int count;
System.out.println("how much cowndown before new year?");
count = scanner.nextInt();

for(int i = count ; i >= 0; i--){

    System.out.println(i);
}

System.out.println("Happy new year");



scanner.close();





}
    
}
