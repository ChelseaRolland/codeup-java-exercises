package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        System.out.println("What would you like to do?");

        System.out.println("0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category");

        System.out.print("Enter your choice: ");
        Input userInput = new Input();

        if (userInput.getInt() == 0){
            //Exit the game
        } else if (userInput.getInt() == 1) {
            //View all of the movies
            for (Movie film: movie) {

            }
        } else if (userInput.getInt() == 2){
            //view movies in the animated category
        } else if (userInput.getInt() == 3) {
            //view movies in the drama category
        } else if (userInput.getInt() == 4) {
            //view movies in the horror category
        } else if (userInput.getInt() == 5) {
            //view movies in the scifi category
        } else {
            //This is not an option
        }
    }
}
