package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme_9_ConvertUpperToLowerCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string : ");
        String uppercase = scanner.nextLine();
        // closing the scanner object
        scanner.close();
Programme_9_ConvertUpperToLowerCase obj = new Programme_9_ConvertUpperToLowerCase();
obj.convertUppercase(uppercase);
    }

    public void convertUppercase(String text){
        System.out.println("The Lowercase value is "+ text.toLowerCase());
    }

}
