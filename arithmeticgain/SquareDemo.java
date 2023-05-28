
package arithmeticgain;

import java.util.Scanner;

public class SquareDemo {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    double Base, Area;
    System.out.print("Enter the base number: ");
    Base= input.nextDouble();
    Area= Base*Base;
    System.out.print("The Square is: "+Area);
    }
}
