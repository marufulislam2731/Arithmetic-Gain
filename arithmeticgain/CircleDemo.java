
package arithmeticgain;

import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);
        double Radius, Area;
        System.out.print("Enter your radius number: ");
        Radius= input.nextDouble();
        Area= 3.1416*Radius*Radius;
        System.out.print("The Circle Area is: "+Area);
    }
}
