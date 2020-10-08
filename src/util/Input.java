package util;

import java.util.Scanner;

public class Input {

    /**
     Create an input validation class

     Create a package inside of src named util. Inside of util, create a class named Input that has a private property named scanner.
     1) When an instance of this object is created [create a constructor], the scanner property should be set to a new instance of the Scanner class. The class should have the following methods, all of which return command line input from the user:

     String getString()
     boolean yesNo()
     int getInt(int min, int max)
     int getInt()
     double getDouble(double min, double max)
     double getDouble()
     The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.

     The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.

     Create another class named util.InputTest that has a static main method that uses all the methods from the Input class.

     Bonus

     Allow all of your methods for getting input to accept an optional String parameter named prompt. If passed, the method should show the given prompt to the user before parsing the input.

     **/

    private Scanner scanner;
    //private static Scanner scanner = new Scanner(System.in); --> is another way to do this

    public Input() {
        this.scanner = new Scanner(System.in);
    };

    //Methods for Input Class//
    public String getString() {
        return this.scanner.nextLine().trim();
    };

    public boolean yesNo() {
        System.out.println("Please enter either yes or no");
        String input = this.scanner.nextLine().trim();
        boolean response = input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
        return response;
    };

//    public int getInt(String prompt) {
//        System.out.println(prompt);
//        int inputNum = Integer.parseInt(scanner.nextLine());
//        return inputNum;
//    }

    public int getInt(int min, int max) {
        while(true){
            System.out.printf("Please enter integers between %d and %d\n", min, max);
            int inputNum = Integer.parseInt(scanner.nextLine());
            if (inputNum >= min && inputNum <= max){
                return inputNum;
            }
        }
    };

//    public int getInt() {
//        return getInt("Please input an integer");
//    };

    public int getInt() {
        return Integer.parseInt(scanner.nextLine());
    };

    public double getDouble(String prompt) {
        System.out.println(prompt);
        double inputNum = Double.parseDouble(scanner.nextLine());
        return inputNum;
    };

    public double getDouble() {
        return getDouble("Please enter a number");
    };

    public double getDouble(double min, double max) {
        while(true){
            System.out.printf("Please enter a number between %f and %f\n", min, max);
            double inputNum = Double.parseDouble(scanner.nextLine());
            if (inputNum >= min && inputNum <= max){
                return inputNum;
            }
        }
    };


}
