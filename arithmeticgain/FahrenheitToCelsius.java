
package arithmeticgain;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args){
    Scanner input= new Scanner(System.in);
    double Fahrenheit, Celsius;
    System.out.print("Fahrenheit: ");
    Fahrenheit= input.nextDouble();
    Celsius= 0.55*Fahrenheit-32;
    System.out.print("The Celsius is: "+Celsius);
    }
}
