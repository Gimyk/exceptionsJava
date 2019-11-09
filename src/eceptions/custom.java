package eceptions;

import java.util.Scanner;

public class custom {

    public static void main(String args[]) {
//        try{
//            Scanner inp = new Scanner(System.in);
//            System.out.println("Please enter the name");
//            String name = inp.next();
//            
//            if("John".equals(name)){
//                System.out.println("The Name is Correct");
//            }else{
//                throw new CustomException("The name is not John");
//            }
//            
//        }catch(CustomException ex){
//            System.err.println(ex.getMessage());
//        }

        try {
            //You have a list of animals off which you need to enter the records; 
            // The records are, the name of the animal and the age of the animal

            String names[] = new String[5];
            int age[] = new int[5];
            Scanner inp = new Scanner(System.in);

            for (int i = 0; i < names.length; i++) {
                System.out.println("PLease enter the name of the animal");
                names[i] = inp.next();
                System.out.println("PLease enter the age of the animal");
                age[i] = inp.nextInt();

                if (age[i] <= 0) {
                    throw new CustomException("Age of the animal can not be 0 or less");
                }

            }

        } catch (CustomException ex) {
            System.err.println(ex.getMessage());
        }

    }

}

class CustomException extends Exception {

    public CustomException(String m) {
        super(m);
    }

}
