
package arithmeticgain;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    double Celsius, Fahrenheit;
    System.out.print("Celsius: ");
    Celsius= input.nextDouble();
    Fahrenheit= 1.8*Celsius+32;
    System.out.print("The Fahrenheit is: "+Fahrenheit);
    }
}
