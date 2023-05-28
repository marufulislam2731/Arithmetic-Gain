
package arithmeticgain;
import java.util.Scanner;
public class TriangleDemo {  
    public static void main(String[] args){ 
    Scanner input= new Scanner(System.in); 
    double Base, Height, Area;
    System.out.print("Enter your base number: ");
    Base= input.nextDouble();
    System.out.print("Enter your height number: ");
    Height= input.nextDouble();
    Area= 0.5*Base*Height;
    System.out.print("The area is: "+Area);
   }   
}
