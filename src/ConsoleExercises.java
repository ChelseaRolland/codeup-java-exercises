import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        //Q1
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f\n", pi);

        //Q2
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter a number: ");
        int userInt = scan.nextInt();

        System.out.println("Your number is: \"" + userInt + "\".");

        //Q3
        System.out.println("Enter 3 words: ");
        String firstWord = scan.next();
        String secondWord = scan.next();
        String thirdWord = scan.next();

        System.out.printf("Your letters are: %s, %s, %s. \n", firstWord, secondWord, thirdWord);

        //Q4
        System.out.println("Enter a sentence: ");
        //String yourSentence = scan.next();
        //System.out.printf("Your sentence is here: %s", yourSentence);

        //Q5
        String yourSentence = scan.nextLine();
        System.out.printf("Your sentence is here: %s", yourSentence);




    }
}
