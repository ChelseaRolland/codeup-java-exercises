import jdk.swing.interop.SwingInterOpUtils;
import util.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionsMiniExercises {

    public static void main(String[] args) {
        //String [] pets = {"dog", "cat", "bird"};
        //System.out.println(pets[3]);

        //int i = "Awesome";

        //ArrayList<String> list = new ArrayList<String>();
        //list.get(0);

        //Null pointer exception --> make sure you set up the datatype correctly
        //ArrayList<String> list = null;
        //list.get(0);

        //ArrayList<String> list1 = new ArrayList<String>();
        //list1.add("book");
        //System.out.println(list1.get(0));

        //TryCatch

        try{
            String [] nuts = {"pecans", "almonds", "cashews"};
            System.out.println(nuts[3]);
        } catch (Exception e) {
            System.out.println("This is an exception");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("What is you favorite number?");
        try {
            int userNum = scan.nextInt();
            System.out.println(userNum);
        } catch (Exception e) {
            System.out.println("Sorry! Please enter a number");
        }

        try {
            //int[] a = null;
            //System.out.println(a[1]);

            int[] a = {13};
            System.out.println(a[1]);

        } catch (NullPointerException e) {
            System.out.println("Your array is null!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Your index is out of bounds!");
        } catch (Exception e) {
            System.out.println("Something else went wrong");
        }




    }
}
