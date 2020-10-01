import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //Loop Basics
//            //Q1: WHILE LOOPs
//            int i = 5;
//            while (i <= 15) {
//                System.out.println(i);
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

                //Q.2c --> Cant figure out right
//                int k = 2;
//                do {
//                    System.out.println(k);
//                    k*=k;
//                }
//                while (k < 1000000);

                //Q.3: FOR LOOPS
//                for (int l = 5; l <= 15; l++){
//                    System.out.println(l);
//                };

//                for (int m = 0; m <= 100; m+=2){
//                    System.out.println(m);
//                }

//                for (int n = 100; n >= -10; n-=5) {
//                    System.out.println(n);
//                };

                for (int q = 2; q < 1000000; q*=q){
                    System.out.println(q);
                    if (q == 65536){
                        break;
                    }
                };

                //Q4 --> FIZZBUZZ
//                for (int x = 0; x <= 100; x++){
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
//                        System.out.println(p + "       | " + Math.pow(p, 2) + "      | " + Math.pow(p, 3));
//                    }
//                }

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





    }

}
