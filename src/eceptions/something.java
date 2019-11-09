/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eceptions;

/**
 *
 * @author gkafu
 */
public class something {

    // Driver Program 
    public static void main(String args[]) {
        try {
            // Throw an object of user defined exception 
            String name = "Jane";
            if (name != "something"){
                throw new MyException("GeeksGeeks");
            }
        } catch (MyException ex) {
//            System.out.println("Caught");

            // Print the message from MyException object 
            System.out.println(ex.getMessage());
        }
    }
}
// A Class that represents use-defined expception 

class MyException extends Exception {

    public MyException(String s) {
        // Call constructor of parent Exception 
        super(s);
    }
}
