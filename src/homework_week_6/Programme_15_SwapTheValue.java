package homework_week_6;

import java.util.Scanner;

/**
* Write a Java program to swap two variables.
*/
public class Programme_15_SwapTheValue {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter +the first variable value : ");
        int first = scanner.nextInt();

        System.out.println("Enter +the Second variable value : ");
        int second = scanner.nextInt();
        // closing the scanner object
        scanner.close();
        Programme_15_SwapTheValue obj = new Programme_15_SwapTheValue();
        obj.swapTheValue(first, second);

    }

    // Swapping the value of variable
    public void swapTheValue(int a, int b) {

        int c;
        System.out.println("Before the swapping, The value of first variableis : " + a + " and second variable is : " + b);

        c = a;
        a = b;
        b = c;
        System.out.println("After the swappin. The Value of first variable : " + a + " and second variable is : " + b);

    }






}
