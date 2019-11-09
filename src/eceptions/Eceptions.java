/*
    try and catch and finally 
 */
package eceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eceptions {

    public static void main(String[] args) {
        try {
            int num1 = 0;
            int num2 = 10;

            int sum = num2 / num1;
            System.out.println("The sum => " + sum);

            Scanner inp = new Scanner(System.in);
            System.out.println("Please enter a number");
            int num = inp.nextInt();

            int numbers[] = {1, 2, 3, 4};
            System.out.println("The number on index 5 is: " + numbers[7]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error Index out of bounds:");
        } catch (InputMismatchException e) {
            System.out.println("Error Input miss match:");
        } catch (Exception e) {
            System.out.println("Error happened:" + e);
        } finally {
            System.out.println("This is the finally block");
        }

        // you can catch more than one error
        //        You can catch specific errors
    }

}

// Exceptions are errors that happen in a program either before or during runtime
// You use a try and catch to hanlde the errors so that you can print a more specific and descriptive error 
// to the user
//  The finnaly block always runs even when an error happens

