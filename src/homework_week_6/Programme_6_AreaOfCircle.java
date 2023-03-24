package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */
public class Programme_6_AreaOfCircle {

    public static void main(String[] args) {

        //Scanner obj declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Radius : ");
        double radious = scanner.nextDouble();
        areaOfCircle(radious);
        // Closing the Scanner objet
        scanner.close();
    }

    // Calculating the area of circle
    public static void areaOfCircle(double radious) {
        double pi = Math.PI;
        double area = (pi * radious * radious);
        System.out.println("The area of Circle is : " + area);
    }
}
