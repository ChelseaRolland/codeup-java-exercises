import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        System.out.println("Welcome to the GAME!");
        System.out.println("This game will be a guessing game!");
        guessGame();
    }

    public static int randomNumber () {
        int min = 1;
        int max = 100;
        int range = max - min + 1;

        int random = (int) (Math.random() * range) + min;

        return random;
    }

    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        //setup the Conditional of the user input to determine if its outside the min and max range
        if (userInput < min || userInput > max) {
            System.out.printf("Please choose a number between %d and %d.\n", min, max);
            return getInteger(min, max);
        }

        return userInput;
    }

    //users input --> this will also verify if the number is within the proper range

    public static int guessGame () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please chose a number between 1 and 100");
        int userNum = getInteger(1,100);
        scan.nextLine();
        int randomNumber = randomNumber();

        if (userNum == randomNumber){
            System.out.println("Good Guess!");
            System.out.printf("The random number was %d\n", randomNumber);
            System.out.println("Do you wish to continue? [y/n]");
            String userResponse = scan.nextLine();
            if (userResponse.equalsIgnoreCase("yes") || userResponse.equalsIgnoreCase("y")) {
                guessGame();
            }
        } else if (userNum > randomNumber()) {
            System.out.println("Lower...");
            System.out.printf("The random number was %d\n", randomNumber);
            guessGame();
        } else {
            System.out.println("Higher...");
            System.out.printf("The random number was %d\n", randomNumber);
            guessGame();
        }

//        System.out.println("Do you wish to continue? [y/n]");
//        String userResponse = scan.nextLine();
//        if (userResponse.equalsIgnoreCase("yes") || userResponse.equalsIgnoreCase("y")) {
//            guessGame();
//        }

        return userNum;
    }

}
