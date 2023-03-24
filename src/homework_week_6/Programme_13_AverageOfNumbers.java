package homework_week_6;

import java.util.Scanner;

/*
 *Write a Java program that takes three numbers as input to calculate and
 *print the average of the numbers.
 */
public class Programme_13_AverageOfNumbers {

    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the first number ");
        double x = scanner.nextDouble();
        System.out.println(" Enter the Second number ");
        double y = scanner.nextDouble();
        System.out.println(" Enter the first number ");
        double z = scanner.nextDouble();
        // Closing the scanner object
        scanner.close();
        averageOfThreenumber(x, y, z);

    }

    // Calculation the average of three numbers
    public static void averageOfThreenumber(double a, double b, double c) {
        double average = ((a + b + c) / 3);
        System.out.println("The averageof " + a + "," + b + " and " + c + "is : " + average);

    }
}