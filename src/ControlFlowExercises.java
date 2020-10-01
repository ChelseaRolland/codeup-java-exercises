import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //Loop Basics
//            //Q1: WHILE LOOPs
//            int i = 5;
//            while (i <= 15) {
//                System.out.print(i + " ");
//                i++;
//            }
//
//            //Q2: DO-WHILE LOOPS
//                //Q.2a
//                int j = 0;
//                do {
//                    System.out.println(j);
//                    j+=2;
//                }
//                while(j <= 100);

//                //Q.2b
//                int h = 100;
//                do {
//                    System.out.println(h);
//                    h-=5;
//                }
//                while(h >= -10);

                //Q.2c
//                long k = 2;
                    //have to use either a double (w/ decimal) or long (w/o decimal) since the int scope is not enough data for the square in the loop
//                do {
//                    System.out.println(k);
//                    k*=k;
//                }
//                while (k < 1000000);

                //Q.3: FOR LOOPS --> REFACTORING THE ABOVE LOOPS
//                for (int l = 5; l <= 15; l++){
//                    System.out.println(l);
//                };

//                for (int m = 0; m <= 100; m += 2){
//                    System.out.println(m);
//                }

//                for (int n = 100; n >= -10; n -= 5) {
//                    System.out.println(n);
//                };

//                for (long q = 2; q < 1000000; q *= q){
//                    //have to use either a double (w/ decimal) or long (w/o decimal) since the int scope is not enough data for the square in the loop
//                    System.out.println(q);
//                };

                //Q4 --> FIZZBUZZ
//                for (int x = 0; x <= 100; x++){
//                    if(x % 15 == 0) --> preferred since its less code; multiplied the 2 required modulus together to get the main modulus
//                    if (x % 3 == 0 && x % 5 == 0){
//                        System.out.println("FizzBuzz");
//                    }
//                    else if (x % 3 == 0) {
//                        System.out.println("Fizz");
//                    } else if (x % 5 == 0) {
//                        System.out.println("Buzz");
//                    } else {
//                        System.out.println(x);
//                    }
//                }

//                //Q5 Display Table of Powers
                Scanner scan = new Scanner(System.in);
//                System.out.println("Please input an integer?");
//                int numInt = scan.nextInt();
//
//                System.out.println("Do you wish to continue? [y/n]");
//                String userInput = scan.next();
//                boolean userConfirmation = userInput.equalsIgnoreCase("y");
//
//                if (userConfirmation) {
//                    System.out.println("What number would you like to go up to? " + userInput);
//                    System.out.println("Here is your table!");
//
//                    System.out.println("number  | squared  | cubed ");
//                    System.out.println("------  | -------- | ----- ");
//
//                    for (int p = 0; p <= numInt; p++) {
//                        System.out.println(p + "       | " + (p * p) + "      | " + (p * p * p));
//                        System.out.println(p + "       | " + Math.pow(p, 2) + "      | " + Math.pow(p, 3));
//                    }
//                }
//                boolean userContinues =  true;
//                do {
//                    System.out.println("What number would you like to go up to?");
//                    int numInt = scan.nextInt();
//                    System.out.println("Here is your table!");
//                    System.out.println("");
//                    System.out.println("number | squared | cubed ");
//                    System.out.println("------ | ------- | ----- ");
//                    for (int p = 0; p <= numInt; p++) {
//                        System.out.printf("%-6d", p);
//                        System.out.print(" | ");
//                        System.out.printf("%-7d", p * p);
//                        System.out.print(" | ");
//                        System.out.print(p * p * p);
//                        System.out.println();
//                    }
//
//                    System.out.println("Would you like to enter another number [y/n]");
//                    String userResponse = scan.next();
//                    if (!userResponse.equalsIgnoreCase("y")) {
//                        userContinues = false;
//                    }
//
//                } while (userContinues);

//                //Q6 --> Switch Statements
//                System.out.println("Please input a number between 0 - 100");
//                int grades = scan.nextInt();
//
//                System.out.println("Do you wish to continue? [y/n]");
//                String userConfirm = scan.next();
//                boolean userConfirm1 = userConfirm.equalsIgnoreCase("y");
//
//                if (userConfirm1){
//                    String letterGrade = "";
//
//                    if (grades <= 59) {
//                        letterGrade = "F";
//                    } else if (grades <= 66) {
//                        letterGrade = "D";
//                    } else if (grades <= 79) {
//                        letterGrade = "C";
//                    } else if (grades <= 87) {
//                        letterGrade = "B";
//                    } else if (grades <= 100) {
//                        letterGrade = "A";
//                    } else {
//                        letterGrade = "This is not a valid grade!";
//                    }
//                    System.out.println("Your grade is " + grades + "%. And your letter-grade is " + letterGrade);
//                }
                boolean userCont = true;
                do {
                    System.out.print("Please enter a numerical grade from 0 to 100");
                    int numericGrade = scan.nextInt();

                    if (numericGrade >= 88) {
                        System.out.println("A");
                    }else if (numericGrade >= 80) {
                        System.out.println("B");
                    } else if (numericGrade >= 67) {
                        System.out.println("C");
                    } else if (numericGrade >= 60) {
                        System.out.println("D");
                    } else {
                        System.out.println("F");
                    }

                    System.out.println("Would you like to enter another grade (y/n)");
                    String userGradesResponse = scan.next();
                    if (!userGradesResponse.equalsIgnoreCase("y")) {
                        userCont = false;
                    }
                } while (userCont);
    }

}
