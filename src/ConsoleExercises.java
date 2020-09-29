import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        //Q1
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f\n", pi);
//
//        //Q2
        Scanner scan = new Scanner (System.in);
//
//        System.out.println("Enter a number: ");
//        int userInt = scan.nextInt();
//
//        System.out.println("Your number is: \"" + userInt + "\".");
//
//        //Q3
//        System.out.println("Enter 3 words: ");
//        String firstWord = scan.next();
//        String secondWord = scan.next();
//        String thirdWord = scan.next();
//
//        System.out.printf("Your letters are: %s, %s, %s \n", firstWord, secondWord, thirdWord);

        //Q4
        //System.out.println("Enter a sentence: ");
        //String yourSentence = scan.next();
        //System.out.printf("Your sentence is here: %s. \n", yourSentence);

        //Q5
//        System.out.println("Enter the 2nd Sentence: ");
//        String yourSentence1 = scan.nextLine();
//        System.out.println("Your 2nd sentence is here: " + yourSentence1);
//        System.out.printf("Your 2nd sentence is here: %s \n", yourSentence1);


        //Calculate the Perimeter and Area of the Codeup Class Room

        //Q1
        System.out.println("Enter the length and width of a CodeUP Classroom: ");
        String userLength = scan.next();
        String userWidth = scan.next();
//        System.out.println(userLengthWidth);
        int length = Integer.parseInt(userLength);
        int width = Integer.parseInt(userWidth);
        System.out.println("This is the length: " + length + ". This is the width: " + width + ".");
//        System.out.println("The corresponding length and width of the classroom is: " + lengthWidth);

        //Q2
        System.out.println("The area of the Codeup Classroom is: " + length * width);
        System.out.println("The perimeter of the Codeup Classroom is: " + ((length * 2) + (width * 2)));


        //BONUS


    }
}
