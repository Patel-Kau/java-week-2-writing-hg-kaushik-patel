package homework_week_6;

/**
 * Write a program for a calculator with addition, subtraction, multiplication and division
 * methods all with parameters and use string concatenation methods.
 * (Note: Two static and Two instance methods.)
 */
public class Programme_5_Calculation {

    // static methods
    public static void addition(int a, int b) {
        int result = a + b;
        System.out.println(" The addition of " + a + "and" + b + "is : " + result);
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

}
