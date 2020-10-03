import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println("add(1,2) = " + add(1, 2));
        System.out.println("subtract(1,2) = " + subtract(1, 2));
        System.out.println("multiply(1,2) = " + multiply(1, 2));
        divide(1,0);
        divide(10,5);
        System.out.println("modulus(2,10) = " + modulus(2, 10));

//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);

//        factorial();
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

//    public static void multiplication (int num1, int num2) {
//        for (int i = 0; i <= num2; i++) {
//            System.out.println();
//        }
//    }

//    public static int getInteger(int min, int max) {
//        Scanner scan = new Scanner(System.in);
////        min = scan.nextInt();
////        max = scan.nextInt();
//
//        if (min >= 1 && max <= 10) {
//            return
//        } else if ()
//
//
//        if (min >= 1 && min < max) {
//            return min;
//        } else if (max <= 10 && min < max) {
//            return max;
//        }
//        return getInteger(min, max);
//    }

//    public static void factorial () {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter a number from 1 to 10.");
//        int userInput = scan.nextInt();
//
//        if (userInput >= 1 || userInput <= 10) {return 1};
//        return userInput * factorial(userInput - 1);
//    }

}
