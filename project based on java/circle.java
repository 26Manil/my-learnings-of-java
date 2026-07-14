
import java.util.Scanner;

// finding circumfrence,Area,volume of a spear , with value of radius is entered by user
public class circle {
    public static void main(String[] args){


        double R,C,A,V;
Scanner scanner = new Scanner(System.in);
System.out.println(" enter the value for radius of the circle cm : ");
R = scanner.nextDouble();

 scanner.nextLine(); 

 
C= 2*Math.PI*R;
A = 2*Math.PI*Math.pow(R,2);
V = 4/3*Math.PI*Math.pow(R,3);

 String x;

System.out.println("enter \nC for circumfrence , \nA for area , \nV for volume");
x = scanner.nextLine();

if (x.equals("C")  ){
    
    System.out.println(C + "cm");
} else if (x.equals("A")  ){

    System.out.println(A + "  sq. cm");
} else if (x.equals("V") ){

    System.out.println(V + " cubic centimeters");
}else {
            System.out.println("Invalid choice");
}
 
scanner.close();




    }
}

