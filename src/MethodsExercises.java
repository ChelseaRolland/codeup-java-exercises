import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println("add(1,2) = " + add(1, 2));
        System.out.println("subtract(1,2) = " + subtract(1, 2));
        System.out.println("multiply(1,2) = " + multiply(1, 2));
        divide(1,0);
        divide(10,5);
        System.out.println("divide(double 2.0, double 10.0) = " + divide(2.0,10.0));
        System.out.println("modulus(2,10) = " + modulus(2, 10));
        System.out.println("multiplication(3,3) = " + multiplication(3,3));

        System.out.println("Enter a number between 1 and 10");
        getInteger(1,10);

        factorial(3);
    }

    public static int add (int num1, int num2) {
        return num1 + num2;
    };

    public static int subtract (int num1, int num2) {
        return num1 - num2;
    };

    public static int multiply (int num1, int num2) {
        return num1 * num2;
    };

    public static void divide (int num1, int num2) {
        if (num2 == 0) {
            System.out.println("This can't be done! You can't divide by 0!");
            System.out.println("This is your num1: " + num1);
        }else {
            System.out.printf("divide(%d,%d) = " + (num1 / num2) + "\n", num1, num2);
        }
    };

    public static double divide (double num1, double num2) {
      return num1 / num2;
    };

    public static int modulus (int num1, int num2) {
        return num1 % num2;
    };

    public static int multiplication (int num1, int num2) {
        //Setup the final output variable
        int result = 0;
        //generate a loop
        for (int i = 1; i <= num2; i++) {
            //load the addition in the result variable
            result += num1;
        }
        //since this isn't a void method, it MUST return a value of the initial data type
        return result;
    }

    public static int getInteger(int min, int max) {
        //Generate the Scanner
        Scanner scan = new Scanner(System.in);
        //Ask the question to the user
        //System.out.println("Enter a number between 1 and 10");

        //Generate a variable to store the value of the user
        int userInput = scan.nextInt();
        //setup the Conditional of the user input to determine if its outside the min and max range
        if (userInput < min || userInput > max) {
            System.out.printf("Please choose a number between %d and %d.\n", min, max);
            return getInteger(min, max);
        }
        //Note when the number is correct is within the min/max range
        System.out.printf("Congrats, your number: %d, falls within the min: %d and max: %d range.\n", userInput, min, max);
        return userInput;
    }

    public static long factorial (long num) {
        //generate a scanner
        Scanner scan = new Scanner(System.in);
        //ask for the user for input
        System.out.println("Please enter a number from 1 to 10.");
        //since we already have a method to determine our range, we will set our userinput to equal it since it also takes the user input via a scan in the method
        int userNum = getInteger(1,10);
        //This will load the final result from the loop
        long result = 1;
        //Stating what the factorial is
        System.out.printf("Your factorial is: %d\n", userNum);

        //Looping to get the factorial result that is based on the userNum
        for(int i = 1; i <= userNum; i++) {
            result *= i;
            System.out.printf("%d! = %d\n", i, result);
        }

        System.out.println("Do you wish to continue? [y/n]");

        //This is the user telling the system if she/he wants to continue
        String userConfirm = scan.nextLine().trim();

        //conditional if the user selects to continue
        if (userConfirm.equalsIgnoreCase("y") || userConfirm.equalsIgnoreCase("yes")) {
            //if yes, then use recursion to redo the current factorial method
            factorial(userNum);
        }

        //return the final results
        return result;
    }



}
